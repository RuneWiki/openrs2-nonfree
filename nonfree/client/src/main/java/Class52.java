import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class52 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt2509 = 65000;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!lh;")
	private Class56 aClass56_3 = null;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!lh;")
	private Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	private final int anInt2513;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILclient!lh;Lclient!lh;I)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3) {
		this.aClass56_2 = arg2;
		this.anInt2513 = arg0;
		this.aClass56_3 = arg1;
		this.anInt2509 = arg3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[B")
	public byte[] method1893(@OriginalArg(1) int arg0) {
		@Pc(8) Class56 local8 = this.aClass56_3;
		synchronized (this.aClass56_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass56_2.method1960()) {
					return null;
				}
				this.aClass56_2.method1966((long) (arg0 * 6));
				this.aClass56_2.method1962(Static142.aByteArray38, 0, 6);
				@Pc(75) int local75 = ((Static142.aByteArray38[1] & 0xFF) << 8) + (Static142.aByteArray38[0] << 16 & 0xFF0000) + (Static142.aByteArray38[2] & 0xFF);
				@Pc(97) int local97 = (Static142.aByteArray38[5] & 0xFF) + ((Static142.aByteArray38[4] & 0xFF) << 8) + ((Static142.aByteArray38[3] & 0xFF) << 16);
				if (local75 < 0 || this.anInt2509 < local75) {
					return null;
				} else if (local97 > 0 && this.aClass56_3.method1960() / 520L >= (long) local97) {
					@Pc(135) int local135 = 0;
					@Pc(138) byte[] local138 = new byte[local75];
					@Pc(140) int local140 = 0;
					label55: while (local135 < local75) {
						if (local97 == 0) {
							return null;
						}
						@Pc(158) int local158 = local75 - local135;
						this.aClass56_3.method1966((long) (local97 * 520));
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass56_3.method1962(Static142.aByteArray38, 0, local158 + 8);
						@Pc(195) int local195 = ((Static142.aByteArray38[0] & 0xFF) << 8) + (Static142.aByteArray38[1] & 0xFF);
						@Pc(201) int local201 = Static142.aByteArray38[7] & 0xFF;
						@Pc(215) int local215 = ((Static142.aByteArray38[2] & 0xFF) << 8) + (Static142.aByteArray38[3] & 0xFF);
						@Pc(238) int local238 = (Static142.aByteArray38[6] & 0xFF) + (((Static142.aByteArray38[4] & 0xFF) << 16) + ((Static142.aByteArray38[5] & 0xFF) << 8));
						if (local195 == arg0 && local215 == local140 && this.anInt2513 == local201) {
							if (local238 >= 0 && this.aClass56_3.method1960() / 520L >= (long) local238) {
								local140++;
								local97 = local238;
								@Pc(277) int local277 = 0;
								while (true) {
									if (local158 <= local277) {
										continue label55;
									}
									local138[local135++] = Static142.aByteArray38[local277 + 8];
									local277++;
								}
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2513;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BZI)Z")
	private boolean method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class56 local8 = this.aClass56_3;
		synchronized (this.aClass56_3) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass56_2.method1960()) {
						return false;
					}
					this.aClass56_2.method1966((long) (arg0 * 6));
					this.aClass56_2.method1962(Static142.aByteArray38, 0, 6);
					local71 = (Static142.aByteArray38[5] & 0xFF) + ((Static142.aByteArray38[3] & 0xFF) << 16) + ((Static142.aByteArray38[4] & 0xFF) << 8);
					if (local71 <= 0 || this.aClass56_3.method1960() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass56_3.method1960() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static142.aByteArray38[5] = (byte) local71;
				@Pc(113) int local113 = 0;
				Static142.aByteArray38[0] = (byte) (arg1 >> 16);
				@Pc(131) int local131 = 0;
				Static142.aByteArray38[3] = (byte) (local71 >> 16);
				Static142.aByteArray38[4] = (byte) (local71 >> 8);
				Static142.aByteArray38[1] = (byte) (arg1 >> 8);
				Static142.aByteArray38[2] = (byte) arg1;
				this.aClass56_2.method1966((long) (arg0 * 6));
				this.aClass56_2.method1958(Static142.aByteArray38, 6, 0);
				while (arg1 > local131) {
					@Pc(176) int local176 = 0;
					@Pc(231) int local231;
					if (arg3) {
						this.aClass56_3.method1966((long) (local71 * 520));
						try {
							this.aClass56_3.method1962(Static142.aByteArray38, 0, 8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						@Pc(203) int local203 = Static142.aByteArray38[7] & 0xFF;
						@Pc(217) int local217 = (Static142.aByteArray38[3] & 0xFF) + ((Static142.aByteArray38[2] & 0xFF) << 8);
						local231 = (Static142.aByteArray38[1] & 0xFF) + ((Static142.aByteArray38[0] & 0xFF) << 8);
						local176 = ((Static142.aByteArray38[4] & 0xFF) << 16) + ((Static142.aByteArray38[5] & 0xFF) << 8) + (Static142.aByteArray38[6] & 0xFF);
						if (arg0 != local231 || local113 != local217 || local203 != this.anInt2513) {
							return false;
						}
						if (local176 < 0 || this.aClass56_3.method1960() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						arg3 = false;
						local176 = (int) ((this.aClass56_3.method1960() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local71 == local176) {
							local176++;
						}
					}
					Static142.aByteArray38[2] = (byte) (local113 >> 8);
					local231 = arg1 - local131;
					Static142.aByteArray38[3] = (byte) local113;
					if (arg1 - local131 <= 512) {
						local176 = 0;
					}
					Static142.aByteArray38[0] = (byte) (arg0 >> 8);
					Static142.aByteArray38[1] = (byte) arg0;
					Static142.aByteArray38[6] = (byte) local176;
					Static142.aByteArray38[7] = (byte) this.anInt2513;
					Static142.aByteArray38[4] = (byte) (local176 >> 16);
					Static142.aByteArray38[5] = (byte) (local176 >> 8);
					local113++;
					if (local231 > 512) {
						local231 = 512;
					}
					this.aClass56_3.method1966((long) (local71 * 520));
					this.aClass56_3.method1958(Static142.aByteArray38, 8, 0);
					local71 = local176;
					this.aClass56_3.method1958(arg2, local231, local131);
					local131 += local231;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[BII)Z")
	public boolean method1897(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class56 local6 = this.aClass56_3;
		synchronized (this.aClass56_3) {
			if (arg1 < 0 || arg1 > this.anInt2509) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1896(arg2, arg1, arg0, true);
			if (!local33) {
				local33 = this.method1896(arg2, arg1, arg0, false);
			}
			return local33;
		}
	}
}
