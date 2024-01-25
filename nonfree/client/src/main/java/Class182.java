import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class182 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!mu;")
	private Class196 aClass196_4 = null;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	private int anInt5812 = 65000;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!mu;")
	private Class196 aClass196_5 = null;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private final int anInt5813;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILclient!mu;Lclient!mu;I)V")
	public Class182(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) int arg3) {
		this.anInt5812 = arg3;
		this.aClass196_5 = arg2;
		this.aClass196_4 = arg1;
		this.anInt5813 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[B")
	public byte[] method4847(@OriginalArg(0) int arg0) {
		@Pc(8) Class196 local8 = this.aClass196_4;
		synchronized (this.aClass196_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass196_5.method5079()) {
					return null;
				}
				this.aClass196_5.method5081((long) (arg0 * 6));
				this.aClass196_5.method5078(6, 0, Static418.aByteArray90);
				@Pc(74) int local74 = ((Static418.aByteArray90[1] & 0xFF) << 8) + (((Static418.aByteArray90[0] & 0xFF) << 16) + (Static418.aByteArray90[2] & 0xFF));
				@Pc(96) int local96 = (Static418.aByteArray90[5] & 0xFF) + ((Static418.aByteArray90[4] & 0xFF) << 8) + ((Static418.aByteArray90[3] & 0xFF) << 16);
				if (local74 < 0 || local74 > this.anInt5812) {
					return null;
				} else if (local96 > 0 && this.aClass196_4.method5079() / 520L >= (long) local96) {
					@Pc(134) byte[] local134 = new byte[local74];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local74) {
						if (local96 == 0) {
							return null;
						}
						this.aClass196_4.method5081((long) (local96 * 520));
						@Pc(161) int local161 = local74 - local136;
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass196_4.method5078(local161 + 8, 0, Static418.aByteArray90);
						@Pc(193) int local193 = (Static418.aByteArray90[1] & 0xFF) + ((Static418.aByteArray90[0] & 0xFF) << 8);
						@Pc(207) int local207 = (Static418.aByteArray90[3] & 0xFF) + ((Static418.aByteArray90[2] & 0xFF) << 8);
						@Pc(229) int local229 = (Static418.aByteArray90[6] & 0xFF) + ((Static418.aByteArray90[5] & 0xFF) << 8) + ((Static418.aByteArray90[4] & 0xFF) << 16);
						@Pc(235) int local235 = Static418.aByteArray90[7] & 0xFF;
						if (arg0 == local193 && local138 == local207 && this.anInt5813 == local235) {
							if (local229 >= 0 && (long) local229 <= this.aClass196_4.method5079() / 520L) {
								for (@Pc(275) int local275 = 0; local275 < local161; local275++) {
									local134[local136++] = Static418.aByteArray90[local275 + 8];
								}
								local138++;
								local96 = local229;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(313) IOException local313) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI[BZI)Z")
	private boolean method4848(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class196 local8 = this.aClass196_4;
		synchronized (this.aClass196_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass196_5.method5079()) {
						return false;
					}
					this.aClass196_5.method5081((long) (arg3 * 6));
					this.aClass196_5.method5078(6, 0, Static418.aByteArray90);
					local22 = ((Static418.aByteArray90[3] & 0xFF) << 16) + ((Static418.aByteArray90[4] & 0xFF) << 8) + (Static418.aByteArray90[5] & 0xFF);
					if (local22 <= 0 || this.aClass196_4.method5079() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass196_4.method5079() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static418.aByteArray90[4] = (byte) (local22 >> 8);
				Static418.aByteArray90[1] = (byte) (arg0 >> 8);
				Static418.aByteArray90[2] = (byte) arg0;
				Static418.aByteArray90[5] = (byte) local22;
				Static418.aByteArray90[0] = (byte) (arg0 >> 16);
				Static418.aByteArray90[3] = (byte) (local22 >> 16);
				this.aClass196_5.method5081((long) (arg3 * 6));
				this.aClass196_5.method5074(Static418.aByteArray90, 0, 6);
				@Pc(163) int local163 = 0;
				@Pc(170) int local170 = 0;
				while (local163 < arg0) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg2) {
						this.aClass196_4.method5081((long) (local22 * 520));
						try {
							this.aClass196_4.method5078(8, 0, Static418.aByteArray90);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = ((Static418.aByteArray90[0] & 0xFF) << 8) + (Static418.aByteArray90[1] & 0xFF);
						local174 = (Static418.aByteArray90[6] & 0xFF) + ((Static418.aByteArray90[5] & 0xFF) << 8) + ((Static418.aByteArray90[4] & 0xFF) << 16);
						@Pc(245) int local245 = ((Static418.aByteArray90[2] & 0xFF) << 8) + (Static418.aByteArray90[3] & 0xFF);
						@Pc(251) int local251 = Static418.aByteArray90[7] & 0xFF;
						if (local209 != arg3 || local245 != local170 || local251 != this.anInt5813) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass196_4.method5079() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						arg2 = false;
						local174 = (int) ((this.aClass196_4.method5079() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local22 == local174) {
							local174++;
						}
					}
					Static418.aByteArray90[1] = (byte) arg3;
					if (arg0 - local163 <= 512) {
						local174 = 0;
					}
					Static418.aByteArray90[0] = (byte) (arg3 >> 8);
					Static418.aByteArray90[3] = (byte) local170;
					Static418.aByteArray90[2] = (byte) (local170 >> 8);
					Static418.aByteArray90[4] = (byte) (local174 >> 16);
					Static418.aByteArray90[7] = (byte) this.anInt5813;
					Static418.aByteArray90[5] = (byte) (local174 >> 8);
					Static418.aByteArray90[6] = (byte) local174;
					this.aClass196_4.method5081((long) (local22 * 520));
					this.aClass196_4.method5074(Static418.aByteArray90, 0, 8);
					local209 = arg0 - local163;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass196_4.method5074(arg1, local163, local209);
					local22 = local174;
					local170++;
					local163 += local209;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5813;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB[BI)Z")
	public boolean method4850(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class196 local6 = this.aClass196_4;
		synchronized (this.aClass196_4) {
			if (arg2 < 0 || arg2 > this.anInt5812) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method4848(arg2, arg1, true, arg0);
			if (!local33) {
				local33 = this.method4848(arg2, arg1, false, arg0);
			}
			return local33;
		}
	}
}
