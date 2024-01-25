import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class35 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!aj;")
	private Class10 aClass10_1 = null;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	private int anInt1084 = 65000;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!aj;")
	private Class10 aClass10_2 = null;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	private final int anInt1091;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILclient!aj;Lclient!aj;I)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3) {
		this.aClass10_2 = arg2;
		this.anInt1084 = arg3;
		this.aClass10_1 = arg1;
		this.anInt1091 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method933(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class10 local8 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass10_2.method169() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass10_2.method171((long) (arg2 * 6));
					this.aClass10_2.method166(Static286.aByteArray62, 6, 0);
					local22 = ((Static286.aByteArray62[3] & 0xFF) << 16) + ((Static286.aByteArray62[4] & 0xFF) << 8) + (Static286.aByteArray62[5] & 0xFF);
					if (local22 <= 0 || this.aClass10_1.method169() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass10_1.method169() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static286.aByteArray62[3] = (byte) (local22 >> 16);
				Static286.aByteArray62[4] = (byte) (local22 >> 8);
				Static286.aByteArray62[1] = (byte) (arg3 >> 8);
				Static286.aByteArray62[2] = (byte) arg3;
				Static286.aByteArray62[5] = (byte) local22;
				Static286.aByteArray62[0] = (byte) (arg3 >> 16);
				this.aClass10_2.method171((long) (arg2 * 6));
				this.aClass10_2.method172(0, 6, Static286.aByteArray62);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (arg3 > local168) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass10_1.method171((long) (local22 * 520));
						try {
							this.aClass10_1.method166(Static286.aByteArray62, 8, 0);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static286.aByteArray62[1] & 0xFF) + ((Static286.aByteArray62[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static286.aByteArray62[3] & 0xFF) + ((Static286.aByteArray62[2] & 0xFF) << 8);
						local174 = (Static286.aByteArray62[6] & 0xFF) + ((Static286.aByteArray62[4] & 0xFF) << 16) + ((Static286.aByteArray62[5] & 0xFF) << 8);
						@Pc(251) int local251 = Static286.aByteArray62[7] & 0xFF;
						if (local209 != arg2 || local170 != local223 || this.anInt1091 != local251) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass10_1.method169() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass10_1.method169() + 519L) / 520L);
						arg0 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local22 == local174) {
							local174++;
						}
					}
					if (arg3 - local168 <= 512) {
						local174 = 0;
					}
					Static286.aByteArray62[2] = (byte) (local170 >> 8);
					Static286.aByteArray62[0] = (byte) (arg2 >> 8);
					Static286.aByteArray62[3] = (byte) local170;
					Static286.aByteArray62[1] = (byte) arg2;
					Static286.aByteArray62[7] = (byte) this.anInt1091;
					Static286.aByteArray62[4] = (byte) (local174 >> 16);
					Static286.aByteArray62[5] = (byte) (local174 >> 8);
					Static286.aByteArray62[6] = (byte) local174;
					this.aClass10_1.method171((long) (local22 * 520));
					this.aClass10_1.method172(0, 8, Static286.aByteArray62);
					local209 = arg3 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass10_1.method172(local168, local209, arg1);
					local168 += local209;
					local170++;
					local22 = local174;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1091;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[BIB)Z")
	public boolean method935(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class10 local6 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			if (arg2 < 0 || this.anInt1084 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(41) boolean local41 = this.method933(true, arg1, arg0, arg2);
			if (!local41) {
				local41 = this.method933(false, arg1, arg0, arg2);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)[B")
	public byte[] method937(@OriginalArg(0) int arg0) {
		@Pc(8) Class10 local8 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass10_2.method169()) {
					return null;
				}
				this.aClass10_2.method171((long) (arg0 * 6));
				this.aClass10_2.method166(Static286.aByteArray62, 6, 0);
				@Pc(66) int local66 = (Static286.aByteArray62[2] & 0xFF) + (((Static286.aByteArray62[0] & 0xFF) << 16) + ((Static286.aByteArray62[1] & 0xFF) << 8));
				@Pc(90) int local90 = ((Static286.aByteArray62[3] & 0xFF) << 16) - (-((Static286.aByteArray62[4] & 0xFF) << 8) - (Static286.aByteArray62[5] & 0xFF));
				if (local66 < 0 || this.anInt1084 < local66) {
					return null;
				} else if (local90 > 0 && this.aClass10_1.method169() / 520L >= (long) local90) {
					@Pc(127) byte[] local127 = new byte[local66];
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					label55: while (local66 > local129) {
						if (local90 == 0) {
							return null;
						}
						this.aClass10_1.method171((long) (local90 * 520));
						@Pc(157) int local157 = local66 - local129;
						if (local157 > 512) {
							local157 = 512;
						}
						this.aClass10_1.method166(Static286.aByteArray62, local157 + 8, 0);
						@Pc(185) int local185 = ((Static286.aByteArray62[0] & 0xFF) << 8) + (Static286.aByteArray62[1] & 0xFF);
						@Pc(199) int local199 = (Static286.aByteArray62[3] & 0xFF) + ((Static286.aByteArray62[2] & 0xFF) << 8);
						@Pc(222) int local222 = ((Static286.aByteArray62[4] & 0xFF) << 16) + ((Static286.aByteArray62[5] & 0xFF) << 8) + (Static286.aByteArray62[6] & 0xFF);
						@Pc(228) int local228 = Static286.aByteArray62[7] & 0xFF;
						if (local185 == arg0 && local199 == local131 && this.anInt1091 == local228) {
							if (local222 >= 0 && (long) local222 <= this.aClass10_1.method169() / 520L) {
								local90 = local222;
								local131++;
								@Pc(270) int local270 = 0;
								while (true) {
									if (local270 >= local157) {
										continue label55;
									}
									local127[local129++] = Static286.aByteArray62[local270 + 8];
									local270++;
								}
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(312) IOException local312) {
				return null;
			}
		}
	}
}
