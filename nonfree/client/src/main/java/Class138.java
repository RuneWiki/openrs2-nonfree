import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class138 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	private int anInt4089 = 65000;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!hl;")
	private Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Lclient!hl;")
	private Class68 aClass68_5 = null;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(ILclient!hl;Lclient!hl;I)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) int arg3) {
		this.aClass68_5 = arg2;
		this.anInt4089 = arg3;
		this.anInt4099 = arg0;
		this.aClass68_4 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[B")
	public byte[] method3445(@OriginalArg(0) int arg0) {
		@Pc(9) Class68 local9 = this.aClass68_4;
		synchronized (this.aClass68_4) {
			try {
				@Pc(28) Object local28;
				if (this.aClass68_5.method1980() < (long) (arg0 * 6 + 6)) {
					local28 = null;
					return (byte[]) local28;
				}
				this.aClass68_5.method1973((long) (arg0 * 6));
				this.aClass68_5.method1974(Static13.aByteArray1, 0, 6);
				@Pc(68) int local68 = (Static13.aByteArray1[2] & 0xFF) + ((Static13.aByteArray1[1] & 0xFF) << 8) + ((Static13.aByteArray1[0] & 0xFF) << 16);
				@Pc(90) int local90 = ((Static13.aByteArray1[4] & 0xFF) << 8) + ((Static13.aByteArray1[3] & 0xFF) << 16) + (Static13.aByteArray1[5] & 0xFF);
				if (local68 < 0 || this.anInt4089 < local68) {
					local28 = null;
					return (byte[]) local28;
				} else if (local90 > 0 && this.aClass68_4.method1980() / 520L >= (long) local90) {
					@Pc(129) byte[] local129 = new byte[local68];
					@Pc(131) int local131 = 0;
					@Pc(133) int local133 = 0;
					while (local68 > local133) {
						if (local90 == 0) {
							local28 = null;
							return (byte[]) local28;
						}
						@Pc(153) int local153 = local68 - local133;
						if (local153 > 512) {
							local153 = 512;
						}
						this.aClass68_4.method1973((long) (local90 * 520));
						this.aClass68_4.method1974(Static13.aByteArray1, 0, local153 + 8);
						@Pc(199) int local199 = (Static13.aByteArray1[6] & 0xFF) + ((Static13.aByteArray1[5] & 0xFF) << 8) + ((Static13.aByteArray1[4] & 0xFF) << 16);
						@Pc(214) int local214 = ((Static13.aByteArray1[2] & 0xFF) << 8) + (Static13.aByteArray1[3] & 0xFF);
						@Pc(220) int local220 = Static13.aByteArray1[7] & 0xFF;
						@Pc(234) int local234 = (Static13.aByteArray1[1] & 0xFF) + ((Static13.aByteArray1[0] & 0xFF) << 8);
						if (local234 != arg0 || local214 != local131 || this.anInt4099 != local220) {
							local28 = null;
							return (byte[]) local28;
						}
						if (local199 < 0 || (long) local199 > this.aClass68_4.method1980() / 520L) {
							local28 = null;
							return (byte[]) local28;
						}
						local131++;
						local90 = local199;
						for (@Pc(277) int local277 = 0; local277 < local153; local277++) {
							local129[local133++] = Static13.aByteArray1[local277 + 8];
						}
					}
					@Pc(299) byte[] local299 = local129;
					return local299;
				} else {
					local28 = null;
					return (byte[]) local28;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4099;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BI)Z")
	public boolean method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class68 local7 = this.aClass68_4;
		synchronized (this.aClass68_4) {
			if (arg0 < 0 || arg0 > this.anInt4089) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method3451(arg1, true, arg2, arg0);
			if (!local37) {
				local37 = this.method3451(arg1, false, arg2, arg0);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ[BI)Z")
	private boolean method3451(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class68 local9 = this.aClass68_4;
		synchronized (this.aClass68_4) {
			try {
				@Pc(72) int local72;
				@Pc(30) boolean local30;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass68_5.method1980()) {
						local30 = false;
						return local30;
					}
					this.aClass68_5.method1973((long) (arg0 * 6));
					this.aClass68_5.method1974(Static13.aByteArray1, 0, 6);
					local72 = (Static13.aByteArray1[5] & 0xFF) + ((Static13.aByteArray1[4] & 0xFF) << 8) + ((Static13.aByteArray1[3] & 0xFF) << 16);
					if (local72 <= 0 || (long) local72 > this.aClass68_4.method1980() / 520L) {
						local30 = false;
						return local30;
					}
				} else {
					local72 = (int) ((this.aClass68_4.method1980() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static13.aByteArray1[1] = (byte) (arg3 >> 8);
				Static13.aByteArray1[2] = (byte) arg3;
				Static13.aByteArray1[3] = (byte) (local72 >> 16);
				Static13.aByteArray1[0] = (byte) (arg3 >> 16);
				Static13.aByteArray1[4] = (byte) (local72 >> 8);
				@Pc(156) int local156 = 0;
				Static13.aByteArray1[5] = (byte) local72;
				@Pc(163) int local163 = 0;
				this.aClass68_5.method1973((long) (arg0 * 6));
				this.aClass68_5.method1978(0, Static13.aByteArray1, 6);
				while (true) {
					if (arg3 > local156) {
						label136: {
							@Pc(183) int local183 = 0;
							@Pc(243) int local243;
							if (arg1) {
								this.aClass68_4.method1973((long) (local72 * 520));
								try {
									this.aClass68_4.method1974(Static13.aByteArray1, 0, 8);
								} catch (@Pc(204) EOFException local204) {
									break label136;
								}
								local183 = (Static13.aByteArray1[6] & 0xFF) + ((Static13.aByteArray1[4] & 0xFF) << 16) + ((Static13.aByteArray1[5] & 0xFF) << 8);
								local243 = ((Static13.aByteArray1[0] & 0xFF) << 8) + (Static13.aByteArray1[1] & 0xFF);
								@Pc(258) int local258 = ((Static13.aByteArray1[2] & 0xFF) << 8) + (Static13.aByteArray1[3] & 0xFF);
								@Pc(264) int local264 = Static13.aByteArray1[7] & 0xFF;
								if (local243 != arg0 || local258 != local163 || local264 != this.anInt4099) {
									local30 = false;
									return local30;
								}
								if (local183 < 0 || (long) local183 > this.aClass68_4.method1980() / 520L) {
									local30 = false;
									return local30;
								}
							}
							if (local183 == 0) {
								arg1 = false;
								local183 = (int) ((this.aClass68_4.method1980() + 519L) / 520L);
								if (local183 == 0) {
									local183++;
								}
								if (local72 == local183) {
									local183++;
								}
							}
							Static13.aByteArray1[7] = (byte) this.anInt4099;
							Static13.aByteArray1[2] = (byte) (local163 >> 8);
							Static13.aByteArray1[3] = (byte) local163;
							Static13.aByteArray1[0] = (byte) (arg0 >> 8);
							Static13.aByteArray1[1] = (byte) arg0;
							if (arg3 - local156 <= 512) {
								local183 = 0;
							}
							Static13.aByteArray1[6] = (byte) local183;
							Static13.aByteArray1[4] = (byte) (local183 >> 16);
							local163++;
							local243 = arg3 - local156;
							if (local243 > 512) {
								local243 = 512;
							}
							Static13.aByteArray1[5] = (byte) (local183 >> 8);
							this.aClass68_4.method1973((long) (local72 * 520));
							this.aClass68_4.method1978(0, Static13.aByteArray1, 8);
							this.aClass68_4.method1978(local156, arg2, local243);
							local156 += local243;
							local72 = local183;
							continue;
						}
					}
					local30 = true;
					return local30;
				}
			} catch (@Pc(431) IOException local431) {
				return false;
			}
		}
	}
}
