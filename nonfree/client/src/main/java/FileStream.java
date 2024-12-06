import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class71 {

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!vf;")
	private Class79 aClass79_3 = null;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	private int anInt2778 = 65000;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!vf;")
	private Class79 aClass79_4 = null;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private final int anInt2777;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILclient!vf;Lclient!vf;I)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3) {
		this.aClass79_4 = arg2;
		this.anInt2777 = arg0;
		this.anInt2778 = arg3;
		this.aClass79_3 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZZ[B)Z")
	private boolean method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class79 local8 = this.aClass79_3;
		synchronized (this.aClass79_3) {
			try {
				@Pc(73) int local73;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.aClass79_4.method1978()) {
						return false;
					}
					this.aClass79_4.method1988((long) (arg0 * 6));
					this.aClass79_4.method1984(6, Static51.aByteArray13, 0);
					local73 = ((Static51.aByteArray13[3] & 0xFF) << 16) - (-((Static51.aByteArray13[4] & 0xFF) << 8) - (Static51.aByteArray13[5] & 0xFF));
					if (local73 <= 0 || this.aClass79_3.method1978() / 520L < (long) local73) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass79_3.method1978() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static51.aByteArray13[3] = (byte) (local73 >> 16);
				Static51.aByteArray13[4] = (byte) (local73 >> 8);
				Static51.aByteArray13[0] = (byte) (arg1 >> 16);
				Static51.aByteArray13[5] = (byte) local73;
				Static51.aByteArray13[2] = (byte) arg1;
				@Pc(149) int local149 = 0;
				Static51.aByteArray13[1] = (byte) (arg1 >> 8);
				@Pc(158) int local158 = 0;
				this.aClass79_4.method1988((long) (arg0 * 6));
				this.aClass79_4.method1979(Static51.aByteArray13, 6, 0);
				while (arg1 > local149) {
					@Pc(177) int local177 = 0;
					@Pc(235) int local235;
					if (arg2) {
						this.aClass79_3.method1988((long) (local73 * 520));
						try {
							this.aClass79_3.method1984(8, Static51.aByteArray13, 0);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local177 = ((Static51.aByteArray13[4] & 0xFF) << 16) + ((Static51.aByteArray13[5] << 8 & 0xFF00) + (Static51.aByteArray13[6] & 0xFF));
						local235 = ((Static51.aByteArray13[0] & 0xFF) << 8) + (Static51.aByteArray13[1] & 0xFF);
						@Pc(249) int local249 = (Static51.aByteArray13[3] & 0xFF) + ((Static51.aByteArray13[2] & 0xFF) << 8);
						@Pc(255) int local255 = Static51.aByteArray13[7] & 0xFF;
						if (local235 != arg0 || local158 != local249 || this.anInt2777 != local255) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass79_3.method1978() / 520L) {
							return false;
						}
					}
					if (local177 == 0) {
						arg2 = false;
						local177 = (int) ((this.aClass79_3.method1978() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local177 == local73) {
							local177++;
						}
					}
					Static51.aByteArray13[2] = (byte) (local158 >> 8);
					Static51.aByteArray13[3] = (byte) local158;
					Static51.aByteArray13[1] = (byte) arg0;
					local235 = arg1 - local149;
					Static51.aByteArray13[7] = (byte) this.anInt2777;
					local158++;
					Static51.aByteArray13[0] = (byte) (arg0 >> 8);
					if (local235 > 512) {
						local235 = 512;
					}
					if (arg1 - local149 <= 512) {
						local177 = 0;
					}
					Static51.aByteArray13[6] = (byte) local177;
					Static51.aByteArray13[5] = (byte) (local177 >> 8);
					Static51.aByteArray13[4] = (byte) (local177 >> 16);
					this.aClass79_3.method1988((long) (local73 * 520));
					this.aClass79_3.method1979(Static51.aByteArray13, 8, 0);
					this.aClass79_3.method1979(arg3, local235, local149);
					local73 = local177;
					local149 += local235;
				}
				return true;
			} catch (@Pc(422) IOException local422) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[B")
	public byte[] method1797(@OriginalArg(1) int arg0) {
		@Pc(8) Class79 local8 = this.aClass79_3;
		synchronized (this.aClass79_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass79_4.method1978()) {
					return null;
				}
				this.aClass79_4.method1988((long) (arg0 * 6));
				this.aClass79_4.method1984(6, Static51.aByteArray13, 0);
				@Pc(70) int local70 = ((Static51.aByteArray13[0] & 0xFF) << 16) + ((Static51.aByteArray13[1] & 0xFF) << 8) + (Static51.aByteArray13[2] & 0xFF);
				@Pc(92) int local92 = ((Static51.aByteArray13[4] & 0xFF) << 8) + ((Static51.aByteArray13[3] & 0xFF) << 16) + (Static51.aByteArray13[5] & 0xFF);
				if (local70 < 0 || local70 > this.anInt2778) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass79_3.method1978() / 520L) {
					@Pc(125) byte[] local125 = new byte[local70];
					@Pc(127) int local127 = 0;
					@Pc(129) int local129 = 0;
					label55: while (local127 < local70) {
						if (local92 == 0) {
							return null;
						}
						this.aClass79_3.method1988((long) (local92 * 520));
						@Pc(155) int local155 = local70 - local127;
						if (local155 > 512) {
							local155 = 512;
						}
						this.aClass79_3.method1984(local155 + 8, Static51.aByteArray13, 0);
						@Pc(186) int local186 = ((Static51.aByteArray13[2] & 0xFF) << 8) + (Static51.aByteArray13[3] & 0xFF);
						@Pc(200) int local200 = (Static51.aByteArray13[1] & 0xFF) + ((Static51.aByteArray13[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static51.aByteArray13[6] & 0xFF) + (((Static51.aByteArray13[4] & 0xFF) << 16) + ((Static51.aByteArray13[5] & 0xFF) << 8));
						@Pc(229) int local229 = Static51.aByteArray13[7] & 0xFF;
						if (arg0 == local200 && local129 == local186 && local229 == this.anInt2777) {
							if (local223 >= 0 && (long) local223 <= this.aClass79_3.method1978() / 520L) {
								local92 = local223;
								local129++;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local155 <= local280) {
										continue label55;
									}
									local125[local127++] = Static51.aByteArray13[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local125;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2777;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII[B)Z")
	public boolean method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class79 local6 = this.aClass79_3;
		synchronized (this.aClass79_3) {
			if (arg1 < 0 || this.anInt2778 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1792(arg0, arg1, true, arg2);
			if (!local33) {
				local33 = this.method1792(arg0, arg1, false, arg2);
			}
			return local33;
		}
	}
}
