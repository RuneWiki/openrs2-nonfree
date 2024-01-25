import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class345 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lclient!ji;")
	private Class179 aClass179_4 = null;

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "Lclient!ji;")
	private Class179 aClass179_5 = null;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
	private int anInt10106 = 65000;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
	private final int anInt10103;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILclient!ji;Lclient!ji;I)V")
	public Class345(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int arg3) {
		this.aClass179_4 = arg2;
		this.anInt10106 = arg3;
		this.anInt10103 = arg0;
		this.aClass179_5 = arg1;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)[B")
	public byte[] method8409(@OriginalArg(1) int arg0) {
		@Pc(8) Class179 local8 = this.aClass179_5;
		synchronized (this.aClass179_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass179_4.method4031()) {
					return null;
				}
				this.aClass179_4.method4026((long) (arg0 * 6));
				this.aClass179_4.method4030(6, 0, Static20.aByteArray140);
				@Pc(78) int local78 = (Static20.aByteArray140[2] & 0xFF) + ((Static20.aByteArray140[1] & 0xFF) << 8) + ((Static20.aByteArray140[0] & 0xFF) << 16);
				@Pc(101) int local101 = (Static20.aByteArray140[5] & 0xFF) + (((Static20.aByteArray140[3] & 0xFF) << 16) + ((Static20.aByteArray140[4] & 0xFF) << 8));
				if (local78 < 0 || this.anInt10106 < local78) {
					return null;
				} else if (local101 > 0 && this.aClass179_5.method4031() / 520L >= (long) local101) {
					@Pc(148) byte[] local148 = new byte[local78];
					@Pc(150) int local150 = 0;
					@Pc(152) int local152 = 0;
					while (local78 > local150) {
						if (local101 == 0) {
							return null;
						}
						this.aClass179_5.method4026((long) (local101 * 520));
						@Pc(178) int local178 = local78 - local150;
						if (local178 > 512) {
							local178 = 512;
						}
						this.aClass179_5.method4030(local178 + 8, 0, Static20.aByteArray140);
						@Pc(206) int local206 = ((Static20.aByteArray140[0] & 0xFF) << 8) + (Static20.aByteArray140[1] & 0xFF);
						@Pc(220) int local220 = (Static20.aByteArray140[3] & 0xFF) + ((Static20.aByteArray140[2] & 0xFF) << 8);
						@Pc(244) int local244 = ((Static20.aByteArray140[4] & 0xFF) << 16) + ((Static20.aByteArray140[5] & 0xFF) << 8) + (Static20.aByteArray140[6] & 0xFF);
						@Pc(250) int local250 = Static20.aByteArray140[7] & 0xFF;
						if (arg0 == local206 && local152 == local220 && local250 == this.anInt10103) {
							if (local244 >= 0 && this.aClass179_5.method4031() / 520L >= (long) local244) {
								local101 = local244;
								for (@Pc(292) int local292 = 0; local292 < local178; local292++) {
									local148[local150++] = Static20.aByteArray140[local292 + 8];
								}
								local152++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local148;
				} else {
					return null;
				}
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method8410(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class179 local8 = this.aClass179_5;
		synchronized (this.aClass179_5) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if (this.aClass179_4.method4031() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass179_4.method4026((long) (arg2 * 6));
					this.aClass179_4.method4030(6, 0, Static20.aByteArray140);
					local71 = ((Static20.aByteArray140[3] & 0xFF) << 16) + (Static20.aByteArray140[4] << 8 & 0xFF00) + (Static20.aByteArray140[5] & 0xFF);
					if (local71 <= 0 || (long) local71 > this.aClass179_5.method4031() / 520L) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass179_5.method4031() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static20.aByteArray140[0] = (byte) (arg1 >> 16);
				Static20.aByteArray140[5] = (byte) local71;
				Static20.aByteArray140[4] = (byte) (local71 >> 8);
				Static20.aByteArray140[1] = (byte) (arg1 >> 8);
				Static20.aByteArray140[3] = (byte) (local71 >> 16);
				Static20.aByteArray140[2] = (byte) arg1;
				this.aClass179_4.method4026((long) (arg2 * 6));
				this.aClass179_4.method4029(6, Static20.aByteArray140, 0);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (arg1 > local165) {
					@Pc(171) int local171 = 0;
					@Pc(208) int local208;
					if (arg3) {
						this.aClass179_5.method4026((long) (local71 * 520));
						try {
							this.aClass179_5.method4030(8, 0, Static20.aByteArray140);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local208 = ((Static20.aByteArray140[0] & 0xFF) << 8) + (Static20.aByteArray140[1] & 0xFF);
						local171 = ((Static20.aByteArray140[4] & 0xFF) << 16) + (Static20.aByteArray140[5] << 8 & 0xFF00) + (Static20.aByteArray140[6] & 0xFF);
						@Pc(244) int local244 = ((Static20.aByteArray140[2] & 0xFF) << 8) + (Static20.aByteArray140[3] & 0xFF);
						@Pc(250) int local250 = Static20.aByteArray140[7] & 0xFF;
						if (arg2 != local208 || local244 != local167 || this.anInt10103 != local250) {
							return false;
						}
						if (local171 < 0 || (long) local171 > this.aClass179_5.method4031() / 520L) {
							return false;
						}
					}
					if (local171 == 0) {
						arg3 = false;
						local171 = (int) ((this.aClass179_5.method4031() + 519L) / 520L);
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local71) {
							local171++;
						}
					}
					Static20.aByteArray140[3] = (byte) local167;
					Static20.aByteArray140[1] = (byte) arg2;
					Static20.aByteArray140[0] = (byte) (arg2 >> 8);
					Static20.aByteArray140[2] = (byte) (local167 >> 8);
					if (arg1 - local165 <= 512) {
						local171 = 0;
					}
					Static20.aByteArray140[6] = (byte) local171;
					Static20.aByteArray140[4] = (byte) (local171 >> 16);
					Static20.aByteArray140[7] = (byte) this.anInt10103;
					Static20.aByteArray140[5] = (byte) (local171 >> 8);
					this.aClass179_5.method4026((long) (local71 * 520));
					this.aClass179_5.method4029(8, Static20.aByteArray140, 0);
					local208 = arg1 - local165;
					if (local208 > 512) {
						local208 = 512;
					}
					this.aClass179_5.method4029(local208, arg0, local165);
					local165 += local208;
					local167++;
					local71 = local171;
				}
				return true;
			} catch (@Pc(426) IOException local426) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt10103;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II[BI)Z")
	public boolean method8412(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class179 local6 = this.aClass179_5;
		synchronized (this.aClass179_5) {
			if (arg2 < 0 || arg2 > this.anInt10106) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method8410(arg1, arg2, arg0, true);
			if (!local35) {
				local35 = this.method8410(arg1, arg2, arg0, false);
			}
			return local35;
		}
	}
}
