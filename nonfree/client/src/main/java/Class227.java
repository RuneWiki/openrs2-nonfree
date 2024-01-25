import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class227 {

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!eba;")
	private Class73 aClass73_3 = null;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!eba;")
	private Class73 aClass73_2 = null;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	private int anInt7257 = 65000;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	private final int anInt7258;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILclient!eba;Lclient!eba;I)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3) {
		this.anInt7257 = arg3;
		this.aClass73_3 = arg1;
		this.anInt7258 = arg0;
		this.aClass73_2 = arg2;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method6171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class73 local8 = this.aClass73_3;
		synchronized (this.aClass73_3) {
			try {
				@Pc(24) int local24;
				if (arg3) {
					if (this.aClass73_2.method1961() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass73_2.method1970((long) (arg1 * 6));
					this.aClass73_2.method1971(0, Static282.aByteArray61, 6);
					local24 = (Static282.aByteArray61[5] & 0xFF) + ((Static282.aByteArray61[4] & 0xFF) << 8) + ((Static282.aByteArray61[3] & 0xFF) << 16);
					if (local24 <= 0 || (long) local24 > this.aClass73_3.method1961() / 520L) {
						return false;
					}
				} else {
					local24 = (int) ((this.aClass73_3.method1961() + 519L) / 520L);
					if (local24 == 0) {
						local24 = 1;
					}
				}
				Static282.aByteArray61[0] = (byte) (arg2 >> 16);
				Static282.aByteArray61[3] = (byte) (local24 >> 16);
				Static282.aByteArray61[4] = (byte) (local24 >> 8);
				Static282.aByteArray61[5] = (byte) local24;
				Static282.aByteArray61[2] = (byte) arg2;
				Static282.aByteArray61[1] = (byte) (arg2 >> 8);
				this.aClass73_2.method1970((long) (arg1 * 6));
				this.aClass73_2.method1963(6, 0, Static282.aByteArray61);
				@Pc(185) int local185 = 0;
				@Pc(187) int local187 = 0;
				while (local185 < arg2) {
					@Pc(191) int local191 = 0;
					@Pc(228) int local228;
					if (arg3) {
						this.aClass73_3.method1970((long) (local24 * 520));
						try {
							this.aClass73_3.method1971(0, Static282.aByteArray61, 8);
						} catch (@Pc(212) EOFException local212) {
							return true;
						}
						local228 = ((Static282.aByteArray61[0] & 0xFF) << 8) + (Static282.aByteArray61[1] & 0xFF);
						@Pc(242) int local242 = (Static282.aByteArray61[3] & 0xFF) + ((Static282.aByteArray61[2] & 0xFF) << 8);
						local191 = (Static282.aByteArray61[6] & 0xFF) + ((Static282.aByteArray61[4] & 0xFF) << 16) + ((Static282.aByteArray61[5] & 0xFF) << 8);
						@Pc(270) int local270 = Static282.aByteArray61[7] & 0xFF;
						if (arg1 != local228 || local242 != local187 || this.anInt7258 != local270) {
							return false;
						}
						if (local191 < 0 || (long) local191 > this.aClass73_3.method1961() / 520L) {
							return false;
						}
					}
					if (local191 == 0) {
						local191 = (int) ((this.aClass73_3.method1961() + 519L) / 520L);
						arg3 = false;
						if (local191 == 0) {
							local191++;
						}
						if (local191 == local24) {
							local191++;
						}
					}
					Static282.aByteArray61[3] = (byte) local187;
					Static282.aByteArray61[1] = (byte) arg1;
					if (arg2 - local185 <= 512) {
						local191 = 0;
					}
					Static282.aByteArray61[0] = (byte) (arg1 >> 8);
					Static282.aByteArray61[2] = (byte) (local187 >> 8);
					Static282.aByteArray61[7] = (byte) this.anInt7258;
					Static282.aByteArray61[6] = (byte) local191;
					Static282.aByteArray61[4] = (byte) (local191 >> 16);
					Static282.aByteArray61[5] = (byte) (local191 >> 8);
					this.aClass73_3.method1970((long) (local24 * 520));
					this.aClass73_3.method1963(8, 0, Static282.aByteArray61);
					local228 = arg2 - local185;
					if (local228 > 512) {
						local228 = 512;
					}
					this.aClass73_3.method1963(local228, local185, arg0);
					local187++;
					local185 += local228;
					local24 = local191;
				}
				return true;
			} catch (@Pc(444) IOException local444) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)Z")
	public boolean method6173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) Class73 local13 = this.aClass73_3;
		synchronized (this.aClass73_3) {
			if (arg0 < 0 || this.anInt7257 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(40) boolean local40 = this.method6171(arg2, arg1, arg0, true);
			if (!local40) {
				local40 = this.method6171(arg2, arg1, arg0, false);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)[B")
	public byte[] method6176(@OriginalArg(1) int arg0) {
		@Pc(8) Class73 local8 = this.aClass73_3;
		synchronized (this.aClass73_3) {
			try {
				if (this.aClass73_2.method1961() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass73_2.method1970((long) (arg0 * 6));
				this.aClass73_2.method1971(0, Static282.aByteArray61, 6);
				@Pc(68) int local68 = ((Static282.aByteArray61[0] & 0xFF) << 16) + ((Static282.aByteArray61[1] & 0xFF) << 8) + (Static282.aByteArray61[2] & 0xFF);
				@Pc(90) int local90 = ((Static282.aByteArray61[4] & 0xFF) << 8) + ((Static282.aByteArray61[3] & 0xFF) << 16) + (Static282.aByteArray61[5] & 0xFF);
				if (local68 < 0 || this.anInt7257 < local68) {
					return null;
				} else if (local90 > 0 && this.aClass73_3.method1961() / 520L >= (long) local90) {
					@Pc(137) byte[] local137 = new byte[local68];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local68 > local139) {
						if (local90 == 0) {
							return null;
						}
						this.aClass73_3.method1970((long) (local90 * 520));
						@Pc(167) int local167 = local68 - local139;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass73_3.method1971(0, Static282.aByteArray61, local167 + 8);
						@Pc(200) int local200 = ((Static282.aByteArray61[0] & 0xFF) << 8) + (Static282.aByteArray61[1] & 0xFF);
						@Pc(214) int local214 = (Static282.aByteArray61[3] & 0xFF) + ((Static282.aByteArray61[2] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static282.aByteArray61[4] & 0xFF) << 16) + (((Static282.aByteArray61[5] & 0xFF) << 8) + (Static282.aByteArray61[6] & 0xFF));
						@Pc(243) int local243 = Static282.aByteArray61[7] & 0xFF;
						if (arg0 == local200 && local141 == local214 && local243 == this.anInt7258) {
							if (local237 >= 0 && (long) local237 <= this.aClass73_3.method1961() / 520L) {
								local141++;
								for (@Pc(284) int local284 = 0; local284 < local167; local284++) {
									local137[local139++] = Static282.aByteArray61[local284 + 8];
								}
								local90 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7258;
	}
}
