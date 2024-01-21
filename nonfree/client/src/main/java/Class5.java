import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt255 = 65000;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!ac;")
	private Class3 aClass3_1 = null;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!ac;")
	private Class3 aClass3_2 = null;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	private final int anInt257;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILclient!ac;Lclient!ac;I)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) int arg3) {
		this.aClass3_1 = arg1;
		this.anInt255 = arg3;
		this.aClass3_2 = arg2;
		this.anInt257 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)Z")
	public boolean method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class3 local6 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			if (arg0 < 0 || this.anInt255 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method127(arg0, true, arg1, arg2);
			if (!local26) {
				local26 = this.method127(arg0, false, arg1, arg2);
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!b", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt257;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method127(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(8) Class3 local8 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			try {
				@Pc(67) int local67;
				if (arg1) {
					if (this.aClass3_2.method96() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass3_2.method99((long) (arg2 * 6));
					this.aClass3_2.method91(6, 0, Static81.aByteArray71);
					local67 = (Static81.aByteArray71[5] & 0xFF) + ((Static81.aByteArray71[4] & 0xFF) << 8) + ((Static81.aByteArray71[3] & 0xFF) << 16);
					if (local67 <= 0 || (long) local67 > this.aClass3_1.method96() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass3_1.method96() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static81.aByteArray71[0] = (byte) (arg0 >> 16);
				Static81.aByteArray71[1] = (byte) (arg0 >> 8);
				Static81.aByteArray71[2] = (byte) arg0;
				Static81.aByteArray71[3] = (byte) (local67 >> 16);
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				Static81.aByteArray71[4] = (byte) (local67 >> 8);
				Static81.aByteArray71[5] = (byte) local67;
				this.aClass3_2.method99((long) (arg2 * 6));
				this.aClass3_2.method93(6, Static81.aByteArray71, 0);
				while (arg0 > local145) {
					@Pc(178) int local178 = 0;
					@Pc(258) int local258;
					if (arg1) {
						this.aClass3_1.method99((long) (local67 * 520));
						try {
							this.aClass3_1.method91(8, 0, Static81.aByteArray71);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local178 = ((Static81.aByteArray71[4] & 0xFF) << 16) - (-((Static81.aByteArray71[5] & 0xFF) << 8) - (Static81.aByteArray71[6] & 0xFF));
						@Pc(238) int local238 = ((Static81.aByteArray71[2] & 0xFF) << 8) + (Static81.aByteArray71[3] & 0xFF);
						@Pc(244) int local244 = Static81.aByteArray71[7] & 0xFF;
						local258 = (Static81.aByteArray71[1] & 0xFF) + ((Static81.aByteArray71[0] & 0xFF) << 8);
						if (local258 != arg2 || local238 != local143 || local244 != this.anInt257) {
							return false;
						}
						if (local178 < 0 || this.aClass3_1.method96() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						arg1 = false;
						local178 = (int) ((this.aClass3_1.method96() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local67) {
							local178++;
						}
					}
					local258 = arg0 - local145;
					if (local258 > 512) {
						local258 = 512;
					}
					Static81.aByteArray71[0] = (byte) (arg2 >> 8);
					Static81.aByteArray71[1] = (byte) arg2;
					Static81.aByteArray71[2] = (byte) (local143 >> 8);
					Static81.aByteArray71[3] = (byte) local143;
					local143++;
					if (arg0 - local145 <= 512) {
						local178 = 0;
					}
					Static81.aByteArray71[4] = (byte) (local178 >> 16);
					Static81.aByteArray71[5] = (byte) (local178 >> 8);
					Static81.aByteArray71[6] = (byte) local178;
					Static81.aByteArray71[7] = (byte) this.anInt257;
					this.aClass3_1.method99((long) (local67 * 520));
					local67 = local178;
					this.aClass3_1.method93(8, Static81.aByteArray71, 0);
					this.aClass3_1.method93(local258, arg3, local145);
					local145 += local258;
				}
				return true;
			} catch (@Pc(441) IOException local441) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[B")
	public byte[] method130(@OriginalArg(0) int arg0) {
		@Pc(8) Class3 local8 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass3_2.method96()) {
					return null;
				}
				this.aClass3_2.method99((long) (arg0 * 6));
				this.aClass3_2.method91(6, 0, Static81.aByteArray71);
				@Pc(70) int local70 = ((Static81.aByteArray71[1] & 0xFF) << 8) + ((Static81.aByteArray71[0] & 0xFF) << 16) + (Static81.aByteArray71[2] & 0xFF);
				@Pc(93) int local93 = ((Static81.aByteArray71[4] & 0xFF) << 8) + (((Static81.aByteArray71[3] & 0xFF) << 16) + (Static81.aByteArray71[5] & 0xFF));
				if (local70 < 0 || this.anInt255 < local70) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass3_1.method96() / 520L) {
					@Pc(129) byte[] local129 = new byte[local70];
					@Pc(131) int local131 = 0;
					@Pc(133) int local133 = 0;
					while (local131 < local70) {
						if (local93 == 0) {
							return null;
						}
						@Pc(148) int local148 = local70 - local131;
						this.aClass3_1.method99((long) (local93 * 520));
						if (local148 > 512) {
							local148 = 512;
						}
						this.aClass3_1.method91(local148 + 8, 0, Static81.aByteArray71);
						@Pc(187) int local187 = ((Static81.aByteArray71[2] & 0xFF) << 8) + (Static81.aByteArray71[3] & 0xFF);
						@Pc(201) int local201 = ((Static81.aByteArray71[0] & 0xFF) << 8) + (Static81.aByteArray71[1] & 0xFF);
						@Pc(223) int local223 = ((Static81.aByteArray71[4] & 0xFF) << 16) + (Static81.aByteArray71[5] << 8 & 0xFF00) + (Static81.aByteArray71[6] & 0xFF);
						@Pc(229) int local229 = Static81.aByteArray71[7] & 0xFF;
						if (arg0 == local201 && local187 == local133 && this.anInt257 == local229) {
							if (local223 >= 0 && this.aClass3_1.method96() / 520L >= (long) local223) {
								local133++;
								for (@Pc(281) int local281 = 0; local281 < local148; local281++) {
									local129[local131++] = Static81.aByteArray71[local281 + 8];
								}
								local93 = local223;
								continue;
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}
}
