import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class24 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!pt;")
	private Class201 aClass201_1 = null;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	private int anInt496 = 65000;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!pt;")
	private Class201 aClass201_2 = null;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	private final int anInt493;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(ILclient!pt;Lclient!pt;I)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3) {
		this.aClass201_1 = arg1;
		this.anInt493 = arg0;
		this.aClass201_2 = arg2;
		this.anInt496 = arg3;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[B)Z")
	public boolean method468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class201 local6 = this.aClass201_1;
		synchronized (this.aClass201_1) {
			if (arg1 < 0 || this.anInt496 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method469(arg1, true, arg0, arg2);
			if (!local26) {
				local26 = this.method469(arg1, false, arg0, arg2);
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIZI[B)Z")
	private boolean method469(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class201 local8 = this.aClass201_1;
		synchronized (this.aClass201_1) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if (this.aClass201_2.method4609() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass201_2.method4606((long) (arg2 * 6));
					this.aClass201_2.method4610(6, Static170.aByteArray40, 0);
					local22 = (Static170.aByteArray40[5] & 0xFF) + ((Static170.aByteArray40[3] & 0xFF) << 16) + ((Static170.aByteArray40[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass201_1.method4609() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass201_1.method4609() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static170.aByteArray40[2] = (byte) arg0;
				Static170.aByteArray40[5] = (byte) local22;
				Static170.aByteArray40[3] = (byte) (local22 >> 16);
				Static170.aByteArray40[1] = (byte) (arg0 >> 8);
				Static170.aByteArray40[0] = (byte) (arg0 >> 16);
				Static170.aByteArray40[4] = (byte) (local22 >> 8);
				this.aClass201_2.method4606((long) (arg2 * 6));
				this.aClass201_2.method4611(Static170.aByteArray40, 6, 0);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (local176 < arg0) {
					@Pc(182) int local182 = 0;
					@Pc(217) int local217;
					if (arg1) {
						this.aClass201_1.method4606((long) (local22 * 520));
						try {
							this.aClass201_1.method4610(8, Static170.aByteArray40, 0);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local217 = ((Static170.aByteArray40[0] & 0xFF) << 8) + (Static170.aByteArray40[1] & 0xFF);
						@Pc(231) int local231 = (Static170.aByteArray40[3] & 0xFF) + ((Static170.aByteArray40[2] & 0xFF) << 8);
						local182 = ((Static170.aByteArray40[5] & 0xFF) << 8) + (Static170.aByteArray40[4] << 16 & 0xFF0000) + (Static170.aByteArray40[6] & 0xFF);
						@Pc(259) int local259 = Static170.aByteArray40[7] & 0xFF;
						if (local217 != arg2 || local178 != local231 || local259 != this.anInt493) {
							return false;
						}
						if (local182 < 0 || this.aClass201_1.method4609() / 520L < (long) local182) {
							return false;
						}
					}
					if (local182 == 0) {
						arg1 = false;
						local182 = (int) ((this.aClass201_1.method4609() + 519L) / 520L);
						if (local182 == 0) {
							local182++;
						}
						if (local182 == local22) {
							local182++;
						}
					}
					if (arg0 - local176 <= 512) {
						local182 = 0;
					}
					Static170.aByteArray40[1] = (byte) arg2;
					Static170.aByteArray40[2] = (byte) (local178 >> 8);
					Static170.aByteArray40[3] = (byte) local178;
					Static170.aByteArray40[0] = (byte) (arg2 >> 8);
					Static170.aByteArray40[6] = (byte) local182;
					Static170.aByteArray40[7] = (byte) this.anInt493;
					Static170.aByteArray40[4] = (byte) (local182 >> 16);
					Static170.aByteArray40[5] = (byte) (local182 >> 8);
					this.aClass201_1.method4606((long) (local22 * 520));
					this.aClass201_1.method4611(Static170.aByteArray40, 8, 0);
					local217 = arg0 - local176;
					if (local217 > 512) {
						local217 = 512;
					}
					this.aClass201_1.method4611(arg3, local217, local176);
					local178++;
					local22 = local182;
					local176 += local217;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[B")
	public byte[] method470(@OriginalArg(1) int arg0) {
		@Pc(8) Class201 local8 = this.aClass201_1;
		synchronized (this.aClass201_1) {
			try {
				if (this.aClass201_2.method4609() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass201_2.method4606((long) (arg0 * 6));
				this.aClass201_2.method4610(6, Static170.aByteArray40, 0);
				@Pc(77) int local77 = ((Static170.aByteArray40[1] & 0xFF) << 8) + ((Static170.aByteArray40[0] & 0xFF) << 16) + (Static170.aByteArray40[2] & 0xFF);
				@Pc(100) int local100 = ((Static170.aByteArray40[4] & 0xFF) << 8) + (((Static170.aByteArray40[3] & 0xFF) << 16) + (Static170.aByteArray40[5] & 0xFF));
				if (local77 < 0 || local77 > this.anInt496) {
					return null;
				} else if (local100 > 0 && (long) local100 <= this.aClass201_1.method4609() / 520L) {
					@Pc(137) byte[] local137 = new byte[local77];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					label55: while (local139 < local77) {
						if (local100 == 0) {
							return null;
						}
						this.aClass201_1.method4606((long) (local100 * 520));
						@Pc(163) int local163 = local77 - local139;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass201_1.method4610(local163 + 8, Static170.aByteArray40, 0);
						@Pc(194) int local194 = ((Static170.aByteArray40[0] & 0xFF) << 8) + (Static170.aByteArray40[1] & 0xFF);
						@Pc(208) int local208 = (Static170.aByteArray40[3] & 0xFF) + ((Static170.aByteArray40[2] & 0xFF) << 8);
						@Pc(230) int local230 = ((Static170.aByteArray40[4] & 0xFF) << 16) + ((Static170.aByteArray40[5] & 0xFF) << 8) + (Static170.aByteArray40[6] & 0xFF);
						@Pc(236) int local236 = Static170.aByteArray40[7] & 0xFF;
						if (local194 == arg0 && local141 == local208 && this.anInt493 == local236) {
							if (local230 >= 0 && this.aClass201_1.method4609() / 520L >= (long) local230) {
								local141++;
								local100 = local230;
								@Pc(282) int local282 = 0;
								while (true) {
									if (local282 >= local163) {
										continue label55;
									}
									local137[local139++] = Static170.aByteArray40[local282 + 8];
									local282++;
								}
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

	@OriginalMember(owner = "client!bh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt493;
	}
}
