import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class25 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt1611 = 65000;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!w;")
	private Class61 aClass61_2 = null;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!w;")
	private Class61 aClass61_3 = null;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private final int anInt1613;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILclient!w;Lclient!w;I)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3) {
		this.anInt1611 = arg3;
		this.anInt1613 = arg0;
		this.aClass61_2 = arg2;
		this.aClass61_3 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[B")
	public byte[] method1071(@OriginalArg(0) int arg0) {
		@Pc(8) Class61 local8 = this.aClass61_3;
		synchronized (this.aClass61_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass61_2.method1741()) {
					return null;
				}
				this.aClass61_2.method1740((long) (arg0 * 6));
				this.aClass61_2.method1734(Static11.aByteArray8, 0, 6);
				@Pc(74) int local74 = ((Static11.aByteArray8[1] & 0xFF) << 8) + ((Static11.aByteArray8[0] & 0xFF) << 16) + (Static11.aByteArray8[2] & 0xFF);
				@Pc(97) int local97 = (Static11.aByteArray8[5] & 0xFF) + ((Static11.aByteArray8[3] & 0xFF) << 16) + ((Static11.aByteArray8[4] & 0xFF) << 8);
				if (local74 < 0 || local74 > this.anInt1611) {
					return null;
				} else if (local97 > 0 && (long) local97 <= this.aClass61_3.method1741() / 520L) {
					@Pc(137) byte[] local137 = new byte[local74];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					label55: while (local74 > local139) {
						if (local97 == 0) {
							return null;
						}
						@Pc(156) int local156 = local74 - local139;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass61_3.method1740((long) (local97 * 520));
						this.aClass61_3.method1734(Static11.aByteArray8, 0, local156 + 8);
						@Pc(194) int local194 = ((Static11.aByteArray8[2] & 0xFF) << 8) + (Static11.aByteArray8[3] & 0xFF);
						@Pc(208) int local208 = (Static11.aByteArray8[1] & 0xFF) + ((Static11.aByteArray8[0] & 0xFF) << 8);
						@Pc(214) int local214 = Static11.aByteArray8[7] & 0xFF;
						@Pc(237) int local237 = ((Static11.aByteArray8[5] & 0xFF) << 8) + (((Static11.aByteArray8[4] & 0xFF) << 16) + (Static11.aByteArray8[6] & 0xFF));
						if (local208 == arg0 && local194 == local141 && this.anInt1613 == local214) {
							if (local237 >= 0 && (long) local237 <= this.aClass61_3.method1741() / 520L) {
								local141++;
								local97 = local237;
								@Pc(288) int local288 = 0;
								while (true) {
									if (local156 <= local288) {
										continue label55;
									}
									local137[local139++] = Static11.aByteArray8[local288 + 8];
									local288++;
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
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI[B)Z")
	private boolean method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class61 local8 = this.aClass61_3;
		synchronized (this.aClass61_3) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass61_2.method1741() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass61_2.method1740((long) (arg0 * 6));
					this.aClass61_2.method1734(Static11.aByteArray8, 0, 6);
					local22 = (Static11.aByteArray8[5] & 0xFF) + ((Static11.aByteArray8[3] & 0xFF) << 16) + ((Static11.aByteArray8[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass61_3.method1741() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass61_3.method1741() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static11.aByteArray8[0] = (byte) (arg1 >> 16);
				Static11.aByteArray8[1] = (byte) (arg1 >> 8);
				Static11.aByteArray8[2] = (byte) arg1;
				Static11.aByteArray8[3] = (byte) (local22 >> 16);
				Static11.aByteArray8[4] = (byte) (local22 >> 8);
				@Pc(152) int local152 = 0;
				Static11.aByteArray8[5] = (byte) local22;
				@Pc(159) int local159 = 0;
				this.aClass61_2.method1740((long) (arg0 * 6));
				this.aClass61_2.method1742(6, Static11.aByteArray8, 0);
				while (local159 < arg1) {
					@Pc(178) int local178 = 0;
					@Pc(235) int local235;
					if (arg2) {
						this.aClass61_3.method1740((long) (local22 * 520));
						try {
							this.aClass61_3.method1734(Static11.aByteArray8, 0, 8);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local178 = (Static11.aByteArray8[6] & 0xFF) + ((Static11.aByteArray8[5] & 0xFF) << 8) + ((Static11.aByteArray8[4] & 0xFF) << 16);
						local235 = (Static11.aByteArray8[1] & 0xFF) + ((Static11.aByteArray8[0] & 0xFF) << 8);
						@Pc(249) int local249 = (Static11.aByteArray8[3] & 0xFF) + ((Static11.aByteArray8[2] & 0xFF) << 8);
						@Pc(255) int local255 = Static11.aByteArray8[7] & 0xFF;
						if (local235 != arg0 || local152 != local249 || this.anInt1613 != local255) {
							return false;
						}
						if (local178 < 0 || (long) local178 > this.aClass61_3.method1741() / 520L) {
							return false;
						}
					}
					if (local178 == 0) {
						arg2 = false;
						local178 = (int) ((this.aClass61_3.method1741() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local22) {
							local178++;
						}
					}
					Static11.aByteArray8[0] = (byte) (arg0 >> 8);
					if (arg1 - local159 <= 512) {
						local178 = 0;
					}
					local235 = arg1 - local159;
					if (local235 > 512) {
						local235 = 512;
					}
					Static11.aByteArray8[1] = (byte) arg0;
					Static11.aByteArray8[2] = (byte) (local152 >> 8);
					Static11.aByteArray8[3] = (byte) local152;
					local152++;
					Static11.aByteArray8[4] = (byte) (local178 >> 16);
					Static11.aByteArray8[5] = (byte) (local178 >> 8);
					Static11.aByteArray8[6] = (byte) local178;
					Static11.aByteArray8[7] = (byte) this.anInt1613;
					this.aClass61_3.method1740((long) (local22 * 520));
					this.aClass61_3.method1742(8, Static11.aByteArray8, 0);
					local22 = local178;
					this.aClass61_3.method1742(local235, arg3, local159);
					local159 += local235;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB[BI)Z")
	public boolean method1074(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class61 local12 = this.aClass61_3;
		synchronized (this.aClass61_3) {
			if (arg2 < 0 || arg2 > this.anInt1611) {
				throw new IllegalArgumentException();
			}
			@Pc(32) boolean local32 = this.method1073(arg0, arg2, true, arg1);
			if (!local32) {
				local32 = this.method1073(arg0, arg2, false, arg1);
			}
			return local32;
		}
	}
}
