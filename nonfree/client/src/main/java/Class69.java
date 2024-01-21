import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class69 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!ja;")
	private Class40 aClass40_2 = null;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int anInt3817 = 65000;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!ja;")
	private Class40 aClass40_3 = null;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	private final int anInt3818;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILclient!ja;Lclient!ja;I)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int arg3) {
		this.anInt3818 = arg0;
		this.aClass40_2 = arg1;
		this.anInt3817 = arg3;
		this.aClass40_3 = arg2;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI[BI)Z")
	public boolean method2945(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class40 local6 = this.aClass40_2;
		synchronized (this.aClass40_2) {
			if (arg0 < 0 || this.anInt3817 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method2947(arg1, true, arg0, arg2);
			if (!local33) {
				local33 = this.method2947(arg1, false, arg0, arg2);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B")
	public byte[] method2946(@OriginalArg(1) int arg0) {
		@Pc(8) Class40 local8 = this.aClass40_2;
		synchronized (this.aClass40_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass40_3.method1929()) {
					return null;
				}
				this.aClass40_3.method1928((long) (arg0 * 6));
				this.aClass40_3.method1921(0, Static148.aByteArray45, 6);
				@Pc(75) int local75 = (Static148.aByteArray45[2] & 0xFF) + ((Static148.aByteArray45[0] & 0xFF) << 16) + ((Static148.aByteArray45[1] & 0xFF) << 8);
				@Pc(97) int local97 = (Static148.aByteArray45[5] & 0xFF) + ((Static148.aByteArray45[3] & 0xFF) << 16) + ((Static148.aByteArray45[4] & 0xFF) << 8);
				if (local75 < 0 || local75 > this.anInt3817) {
					return null;
				} else if (local97 > 0 && this.aClass40_2.method1929() / 520L >= (long) local97) {
					@Pc(141) byte[] local141 = new byte[local75];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					label55: while (local143 < local75) {
						if (local97 == 0) {
							return null;
						}
						this.aClass40_2.method1928((long) (local97 * 520));
						@Pc(171) int local171 = local75 - local143;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass40_2.method1921(0, Static148.aByteArray45, local171 + 8);
						@Pc(199) int local199 = (Static148.aByteArray45[1] & 0xFF) + ((Static148.aByteArray45[0] & 0xFF) << 8);
						@Pc(214) int local214 = ((Static148.aByteArray45[2] & 0xFF) << 8) + (Static148.aByteArray45[3] & 0xFF);
						@Pc(220) int local220 = Static148.aByteArray45[7] & 0xFF;
						@Pc(242) int local242 = (Static148.aByteArray45[6] & 0xFF) + ((Static148.aByteArray45[5] & 0xFF) << 8) + ((Static148.aByteArray45[4] & 0xFF) << 16);
						if (arg0 == local199 && local145 == local214 && local220 == this.anInt3818) {
							if (local242 >= 0 && this.aClass40_2.method1929() / 520L >= (long) local242) {
								local145++;
								local97 = local242;
								@Pc(285) int local285 = 0;
								while (true) {
									if (local285 >= local171) {
										continue label55;
									}
									local141[local143++] = Static148.aByteArray45[local285 + 8];
									local285++;
								}
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZIII)Z")
	private boolean method2947(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class40 local8 = this.aClass40_2;
		synchronized (this.aClass40_2) {
			try {
				@Pc(72) int local72;
				if (arg1) {
					if (this.aClass40_3.method1929() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass40_3.method1928((long) (arg3 * 6));
					this.aClass40_3.method1921(0, Static148.aByteArray45, 6);
					local72 = ((Static148.aByteArray45[3] & 0xFF) << 16) + ((Static148.aByteArray45[4] & 0xFF) << 8) + (Static148.aByteArray45[5] & 0xFF);
					if (local72 <= 0 || this.aClass40_2.method1929() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass40_2.method1929() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static148.aByteArray45[1] = (byte) (arg2 >> 8);
				Static148.aByteArray45[3] = (byte) (local72 >> 16);
				Static148.aByteArray45[4] = (byte) (local72 >> 8);
				Static148.aByteArray45[2] = (byte) arg2;
				Static148.aByteArray45[5] = (byte) local72;
				Static148.aByteArray45[0] = (byte) (arg2 >> 16);
				this.aClass40_3.method1928((long) (arg3 * 6));
				@Pc(171) int local171 = 0;
				this.aClass40_3.method1918(Static148.aByteArray45, 0, 6);
				@Pc(180) int local180 = 0;
				while (local171 < arg2) {
					@Pc(184) int local184 = 0;
					@Pc(241) int local241;
					if (arg1) {
						this.aClass40_2.method1928((long) (local72 * 520));
						try {
							this.aClass40_2.method1921(0, Static148.aByteArray45, 8);
						} catch (@Pc(203) EOFException local203) {
							return true;
						}
						local184 = (Static148.aByteArray45[6] & 0xFF) + ((Static148.aByteArray45[5] & 0xFF) << 8) + ((Static148.aByteArray45[4] & 0xFF) << 16);
						local241 = (Static148.aByteArray45[1] & 0xFF) + ((Static148.aByteArray45[0] & 0xFF) << 8);
						@Pc(255) int local255 = ((Static148.aByteArray45[2] & 0xFF) << 8) + (Static148.aByteArray45[3] & 0xFF);
						@Pc(261) int local261 = Static148.aByteArray45[7] & 0xFF;
						if (local241 != arg3 || local255 != local180 || this.anInt3818 != local261) {
							return false;
						}
						if (local184 < 0 || (long) local184 > this.aClass40_2.method1929() / 520L) {
							return false;
						}
					}
					if (local184 == 0) {
						arg1 = false;
						local184 = (int) ((this.aClass40_2.method1929() + 519L) / 520L);
						if (local184 == 0) {
							local184++;
						}
						if (local72 == local184) {
							local184++;
						}
					}
					Static148.aByteArray45[2] = (byte) (local180 >> 8);
					Static148.aByteArray45[7] = (byte) this.anInt3818;
					if (arg2 - local171 <= 512) {
						local184 = 0;
					}
					Static148.aByteArray45[4] = (byte) (local184 >> 16);
					Static148.aByteArray45[0] = (byte) (arg3 >> 8);
					Static148.aByteArray45[5] = (byte) (local184 >> 8);
					Static148.aByteArray45[3] = (byte) local180;
					local180++;
					Static148.aByteArray45[6] = (byte) local184;
					Static148.aByteArray45[1] = (byte) arg3;
					local241 = arg2 - local171;
					this.aClass40_2.method1928((long) (local72 * 520));
					if (local241 > 512) {
						local241 = 512;
					}
					this.aClass40_2.method1918(Static148.aByteArray45, 0, 8);
					this.aClass40_2.method1918(arg0, local171, local241);
					local72 = local184;
					local171 += local241;
				}
				return true;
			} catch (@Pc(448) IOException local448) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3818;
	}
}
