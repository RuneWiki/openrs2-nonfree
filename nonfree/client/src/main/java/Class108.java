import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class108 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!ol;")
	private Class130 aClass130_3 = null;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	private int anInt3757 = 65000;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!ol;")
	private Class130 aClass130_4 = null;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private int anInt3753;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ILclient!ol;Lclient!ol;I)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) Class130 arg2, @OriginalArg(3) int arg3) {
		this.aClass130_3 = arg2;
		this.anInt3757 = arg3;
		this.aClass130_4 = arg1;
		this.anInt3753 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3753;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[BZIZ)Z")
	private boolean method3084(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class130 local9 = this.aClass130_4;
		synchronized (this.aClass130_4) {
			try {
				@Pc(22) int local22;
				@Pc(48) boolean local48;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.aClass130_3.method3495()) {
						local48 = false;
						return local48;
					}
					this.aClass130_3.method3491((long) (arg0 * 6));
					this.aClass130_3.method3493(Static65.aByteArray9, 0, 6);
					local22 = ((Static65.aByteArray9[3] & 0xFF) << 16) + (((Static65.aByteArray9[4] & 0xFF) << 8) + (Static65.aByteArray9[5] & 0xFF));
					if (local22 <= 0 || this.aClass130_4.method3495() / 520L < (long) local22) {
						local48 = false;
						return local48;
					}
				} else {
					local22 = (int) ((this.aClass130_4.method3495() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static65.aByteArray9[1] = (byte) (arg3 >> 8);
				Static65.aByteArray9[4] = (byte) (local22 >> 8);
				Static65.aByteArray9[0] = (byte) (arg3 >> 16);
				Static65.aByteArray9[2] = (byte) arg3;
				Static65.aByteArray9[5] = (byte) local22;
				@Pc(142) int local142 = 0;
				Static65.aByteArray9[3] = (byte) (local22 >> 16);
				@Pc(151) int local151 = 0;
				this.aClass130_3.method3491((long) (arg0 * 6));
				this.aClass130_3.method3497(6, Static65.aByteArray9, 0);
				while (true) {
					if (arg3 > local142) {
						label130: {
							@Pc(180) int local180 = 0;
							@Pc(239) int local239;
							if (arg2) {
								label149: {
									this.aClass130_4.method3491((long) (local22 * 520));
									try {
										this.aClass130_4.method3493(Static65.aByteArray9, 0, 8);
									} catch (@Pc(200) EOFException local200) {
										break label130;
									}
									local180 = (Static65.aByteArray9[6] & 0xFF) + ((Static65.aByteArray9[5] & 0xFF) << 8) + ((Static65.aByteArray9[4] & 0xFF) << 16);
									local239 = ((Static65.aByteArray9[0] & 0xFF) << 8) + (Static65.aByteArray9[1] & 0xFF);
									@Pc(253) int local253 = (Static65.aByteArray9[3] & 0xFF) + ((Static65.aByteArray9[2] & 0xFF) << 8);
									@Pc(259) int local259 = Static65.aByteArray9[7] & 0xFF;
									if (local239 == arg0 && local151 == local253 && this.anInt3753 == local259) {
										if (local180 >= 0 && this.aClass130_4.method3495() / 520L >= (long) local180) {
											break label149;
										}
										local48 = false;
										return local48;
									}
									local48 = false;
									return local48;
								}
							}
							if (local180 == 0) {
								arg2 = false;
								local180 = (int) ((this.aClass130_4.method3495() + 519L) / 520L);
								if (local180 == 0) {
									local180++;
								}
								if (local22 == local180) {
									local180++;
								}
							}
							local239 = arg3 - local142;
							Static65.aByteArray9[1] = (byte) arg0;
							Static65.aByteArray9[0] = (byte) (arg0 >> 8);
							if (arg3 - local142 <= 512) {
								local180 = 0;
							}
							Static65.aByteArray9[3] = (byte) local151;
							Static65.aByteArray9[5] = (byte) (local180 >> 8);
							Static65.aByteArray9[4] = (byte) (local180 >> 16);
							Static65.aByteArray9[2] = (byte) (local151 >> 8);
							Static65.aByteArray9[6] = (byte) local180;
							if (local239 > 512) {
								local239 = 512;
							}
							local151++;
							Static65.aByteArray9[7] = (byte) this.anInt3753;
							this.aClass130_4.method3491((long) (local22 * 520));
							local22 = local180;
							this.aClass130_4.method3497(8, Static65.aByteArray9, 0);
							this.aClass130_4.method3497(local239, arg1, local142);
							local142 += local239;
							continue;
						}
					}
					local48 = true;
					return local48;
				}
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[B")
	public byte[] method3085(@OriginalArg(0) int arg0) {
		@Pc(9) Class130 local9 = this.aClass130_4;
		synchronized (this.aClass130_4) {
			try {
				@Pc(36) Object local36;
				if (this.aClass130_3.method3495() < (long) (arg0 * 6 + 6)) {
					local36 = null;
					return (byte[]) local36;
				}
				this.aClass130_3.method3491((long) (arg0 * 6));
				this.aClass130_3.method3493(Static65.aByteArray9, 0, 6);
				@Pc(77) int local77 = (Static65.aByteArray9[5] & 0xFF) + ((Static65.aByteArray9[3] & 0xFF) << 16) + ((Static65.aByteArray9[4] & 0xFF) << 8);
				@Pc(99) int local99 = (Static65.aByteArray9[2] & 0xFF) + ((Static65.aByteArray9[1] & 0xFF) << 8) + ((Static65.aByteArray9[0] & 0xFF) << 16);
				if (local99 < 0 || local99 > this.anInt3757) {
					local36 = null;
					return (byte[]) local36;
				} else if (local77 <= 0 || (long) local77 > this.aClass130_4.method3495() / 520L) {
					local36 = null;
					return (byte[]) local36;
				} else {
					@Pc(135) byte[] local135 = new byte[local99];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local139 < local99) {
						if (local77 == 0) {
							local36 = null;
							return (byte[]) local36;
						}
						this.aClass130_4.method3491((long) (local77 * 520));
						@Pc(168) int local168 = local99 - local139;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass130_4.method3493(Static65.aByteArray9, 0, local168 + 8);
						@Pc(198) int local198 = ((Static65.aByteArray9[2] & 0xFF) << 8) + (Static65.aByteArray9[3] & 0xFF);
						@Pc(221) int local221 = ((Static65.aByteArray9[5] & 0xFF) << 8) + (((Static65.aByteArray9[4] & 0xFF) << 16) + (Static65.aByteArray9[6] & 0xFF));
						@Pc(236) int local236 = ((Static65.aByteArray9[0] & 0xFF) << 8) + (Static65.aByteArray9[1] & 0xFF);
						@Pc(242) int local242 = Static65.aByteArray9[7] & 0xFF;
						if (local236 != arg0 || local137 != local198 || this.anInt3753 != local242) {
							local36 = null;
							return (byte[]) local36;
						}
						if (local221 < 0 || this.aClass130_4.method3495() / 520L < (long) local221) {
							local36 = null;
							return (byte[]) local36;
						}
						for (@Pc(282) int local282 = 0; local282 < local168; local282++) {
							local135[local139++] = Static65.aByteArray9[local282 + 8];
						}
						local77 = local221;
						local137++;
					}
					@Pc(303) byte[] local303 = local135;
					return local303;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI[BI)Z")
	public boolean method3086(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class130 local7 = this.aClass130_4;
		synchronized (this.aClass130_4) {
			if (arg0 < 0 || this.anInt3757 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method3084(arg2, arg1, true, arg0);
			if (!local37) {
				local37 = this.method3084(arg2, arg1, false, arg0);
			}
			return local37;
		}
	}
}
