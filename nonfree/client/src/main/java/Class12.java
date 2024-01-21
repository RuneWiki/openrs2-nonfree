import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!ia;")
	private Class27 aClass27_2 = null;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!ia;")
	private Class27 aClass27_3 = null;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private int anInt412 = 65000;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private final int anInt411;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILclient!ia;Lclient!ia;I)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) Class27 arg2, @OriginalArg(3) int arg3) {
		this.aClass27_3 = arg1;
		this.anInt412 = arg3;
		this.aClass27_2 = arg2;
		this.anInt411 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[B)Z")
	public boolean method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class27 local6 = this.aClass27_3;
		synchronized (this.aClass27_3) {
			if (arg0 < 0 || this.anInt412 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(32) boolean local32 = this.method268(arg0, arg1, true, arg2);
			if (!local32) {
				local32 = this.method268(arg0, arg1, false, arg2);
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt411;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZ[B)Z")
	private boolean method268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class27 local8 = this.aClass27_3;
		synchronized (this.aClass27_3) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass27_2.method895() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass27_2.method902((long) (arg1 * 6));
					this.aClass27_2.method897(Static12.aByteArray1, 6, 0);
					local22 = ((Static12.aByteArray1[4] & 0xFF) << 8) + ((Static12.aByteArray1[3] & 0xFF) << 16) + (Static12.aByteArray1[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass27_3.method895() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass27_3.method895() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static12.aByteArray1[3] = (byte) (local22 >> 16);
				Static12.aByteArray1[4] = (byte) (local22 >> 8);
				@Pc(119) int local119 = 0;
				Static12.aByteArray1[1] = (byte) (arg0 >> 8);
				Static12.aByteArray1[5] = (byte) local22;
				@Pc(138) int local138 = 0;
				Static12.aByteArray1[0] = (byte) (arg0 >> 16);
				Static12.aByteArray1[2] = (byte) arg0;
				this.aClass27_2.method902((long) (arg1 * 6));
				this.aClass27_2.method900(Static12.aByteArray1, 6, 0);
				while (local119 < arg0) {
					@Pc(169) int local169 = 0;
					@Pc(227) int local227;
					if (arg2) {
						this.aClass27_3.method902((long) (local22 * 520));
						try {
							this.aClass27_3.method897(Static12.aByteArray1, 8, 0);
						} catch (@Pc(188) EOFException local188) {
							return true;
						}
						local169 = ((Static12.aByteArray1[4] & 0xFF) << 16) + (((Static12.aByteArray1[5] & 0xFF) << 8) + (Static12.aByteArray1[6] & 0xFF));
						local227 = (Static12.aByteArray1[1] & 0xFF) + ((Static12.aByteArray1[0] & 0xFF) << 8);
						@Pc(241) int local241 = (Static12.aByteArray1[3] & 0xFF) + ((Static12.aByteArray1[2] & 0xFF) << 8);
						@Pc(247) int local247 = Static12.aByteArray1[7] & 0xFF;
						if (local227 != arg1 || local241 != local138 || local247 != this.anInt411) {
							return false;
						}
						if (local169 < 0 || (long) local169 > this.aClass27_3.method895() / 520L) {
							return false;
						}
					}
					local227 = arg0 - local119;
					if (local227 > 512) {
						local227 = 512;
					}
					if (local169 == 0) {
						arg2 = false;
						local169 = (int) ((this.aClass27_3.method895() + 519L) / 520L);
						if (local169 == 0) {
							local169++;
						}
						if (local169 == local22) {
							local169++;
						}
					}
					Static12.aByteArray1[0] = (byte) (arg1 >> 8);
					Static12.aByteArray1[1] = (byte) arg1;
					Static12.aByteArray1[3] = (byte) local138;
					Static12.aByteArray1[7] = (byte) this.anInt411;
					Static12.aByteArray1[2] = (byte) (local138 >> 8);
					if (arg0 - local119 <= 512) {
						local169 = 0;
					}
					Static12.aByteArray1[4] = (byte) (local169 >> 16);
					Static12.aByteArray1[5] = (byte) (local169 >> 8);
					Static12.aByteArray1[6] = (byte) local169;
					this.aClass27_3.method902((long) (local22 * 520));
					this.aClass27_3.method900(Static12.aByteArray1, 8, 0);
					local138++;
					this.aClass27_3.method900(arg3, local227, local119);
					local22 = local169;
					local119 += local227;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[B")
	public byte[] method270(@OriginalArg(0) int arg0) {
		@Pc(8) Class27 local8 = this.aClass27_3;
		synchronized (this.aClass27_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass27_2.method895()) {
					return null;
				}
				this.aClass27_2.method902((long) (arg0 * 6));
				this.aClass27_2.method897(Static12.aByteArray1, 6, 0);
				@Pc(68) int local68 = (Static12.aByteArray1[2] & 0xFF) + ((Static12.aByteArray1[0] & 0xFF) << 16) + ((Static12.aByteArray1[1] & 0xFF) << 8);
				@Pc(90) int local90 = (Static12.aByteArray1[5] & 0xFF) + ((Static12.aByteArray1[4] & 0xFF) << 8) + ((Static12.aByteArray1[3] & 0xFF) << 16);
				if (local68 < 0 || local68 > this.anInt412) {
					return null;
				} else if (local90 > 0 && this.aClass27_3.method895() / 520L >= (long) local90) {
					@Pc(130) int local130 = 0;
					@Pc(133) byte[] local133 = new byte[local68];
					@Pc(135) int local135 = 0;
					label55: while (local68 > local130) {
						if (local90 == 0) {
							return null;
						}
						@Pc(149) int local149 = local68 - local130;
						if (local149 > 512) {
							local149 = 512;
						}
						this.aClass27_3.method902((long) (local90 * 520));
						this.aClass27_3.method897(Static12.aByteArray1, local149 + 8, 0);
						@Pc(179) int local179 = Static12.aByteArray1[7] & 0xFF;
						@Pc(194) int local194 = ((Static12.aByteArray1[2] & 0xFF) << 8) + (Static12.aByteArray1[3] & 0xFF);
						@Pc(208) int local208 = (Static12.aByteArray1[1] & 0xFF) + ((Static12.aByteArray1[0] & 0xFF) << 8);
						@Pc(230) int local230 = ((Static12.aByteArray1[4] & 0xFF) << 16) + ((Static12.aByteArray1[5] & 0xFF) << 8) + (Static12.aByteArray1[6] & 0xFF);
						if (arg0 == local208 && local194 == local135 && this.anInt411 == local179) {
							if (local230 >= 0 && this.aClass27_3.method895() / 520L >= (long) local230) {
								local90 = local230;
								local135++;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local280 >= local149) {
										continue label55;
									}
									local133[local130++] = Static12.aByteArray1[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local133;
				} else {
					return null;
				}
			} catch (@Pc(313) IOException local313) {
				return null;
			}
		}
	}
}
