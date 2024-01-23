import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	private int anInt3209 = 2048;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt3198 = 5;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	private int anInt3203 = 2;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "[B")
	private byte[] aByteArray35 = new byte[512];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	private int anInt3200 = 0;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "[S")
	private short[] aShortArray39 = new short[512];

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
	private int anInt3213 = 1;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
	private int anInt3214 = 5;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(32) int local32 = Static272.anIntArray521[arg0] * this.anInt3214 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static281.anInt5558; local42++) {
				Static254.anInt4981 = Integer.MAX_VALUE;
				Static32.anInt874 = Integer.MAX_VALUE;
				Static296.anInt5741 = Integer.MAX_VALUE;
				Static198.anInt4177 = Integer.MAX_VALUE;
				@Pc(66) int local66 = Static234.anIntArray462[local42] * this.anInt3198 + 2048;
				@Pc(70) int local70 = local66 >> 12;
				@Pc(74) int local74 = local70 + 1;
				@Pc(174) int local174;
				for (@Pc(78) int local78 = local36 - 1; local78 <= local40; local78++) {
					@Pc(108) int local108 = this.aByteArray35[(local78 < this.anInt3214 ? local78 : local78 - this.anInt3214) & 0xFF] & 0xFF;
					for (@Pc(112) int local112 = local70 - 1; local112 <= local74; local112++) {
						@Pc(146) int local146 = (this.aByteArray35[local108 + (this.anInt3198 > local112 ? local112 : local112 - this.anInt3198) & 0xFF] & 0xFF) * 2;
						@Pc(151) int local151 = local66 - (local112 << 12);
						@Pc(155) int local155 = local146 + 1;
						@Pc(158) int local158 = local151 - this.aShortArray39[local146];
						@Pc(171) int local171 = local32 - (local78 << 12) - this.aShortArray39[local155];
						local174 = this.anInt3213;
						@Pc(207) int local207;
						if (local174 == 1) {
							local207 = local171 * local171 + local158 * local158 >> 12;
						} else if (local174 == 3) {
							local171 = local171 < 0 ? -local171 : local171;
							local158 = local158 < 0 ? -local158 : local158;
							local207 = local171 >= local158 ? local171 : local158;
						} else if (local174 == 4) {
							local158 = (int) (Math.sqrt((double) ((float) (local158 >= 0 ? local158 : -local158) / 4096.0F)) * 4096.0D);
							local171 = (int) (Math.sqrt((double) ((float) (local171 >= 0 ? local171 : -local171) / 4096.0F)) * 4096.0D);
							local207 = local158 + local171;
							local207 = local207 * local207 >> 12;
						} else if (local174 == 5) {
							local158 *= local158;
							local171 *= local171;
							local207 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local158 + local171) / 1.6777216E7F))) * 4096.0D);
						} else if (local174 == 2) {
							local207 = (local171 >= 0 ? local171 : -local171) + (local158 >= 0 ? local158 : -local158);
						} else {
							local207 = (int) (Math.sqrt((double) ((float) (local158 * local158 + local171 * local171) / 1.6777216E7F)) * 4096.0D);
						}
						if (local207 < Static198.anInt4177) {
							Static254.anInt4981 = Static32.anInt874;
							Static32.anInt874 = Static296.anInt5741;
							Static296.anInt5741 = Static198.anInt4177;
							Static198.anInt4177 = local207;
						} else if (Static296.anInt5741 > local207) {
							Static254.anInt4981 = Static32.anInt874;
							Static32.anInt874 = Static296.anInt5741;
							Static296.anInt5741 = local207;
						} else if (Static32.anInt874 > local207) {
							Static254.anInt4981 = Static32.anInt874;
							Static32.anInt874 = local207;
						} else if (local207 < Static254.anInt4981) {
							Static254.anInt4981 = local207;
						}
					}
				}
				local174 = this.anInt3203;
				if (local174 == 0) {
					local15[local42] = Static198.anInt4177;
				} else if (local174 == 1) {
					local15[local42] = Static296.anInt5741;
				} else if (local174 == 3) {
					local15[local42] = Static32.anInt874;
				} else if (local174 == 4) {
					local15[local42] = Static254.anInt4981;
				} else if (local174 == 2) {
					local15[local42] = Static296.anInt5741 - Static198.anInt4177;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3198 = this.anInt3214 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt3200 = arg0.method2146();
		} else if (arg1 == 2) {
			this.anInt3209 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt3203 = arg0.method2146();
		} else if (arg1 == 4) {
			this.anInt3213 = arg0.method2146();
		} else if (arg1 == 5) {
			this.anInt3198 = arg0.method2146();
		} else if (arg1 == 6) {
			this.anInt3214 = arg0.method2146();
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	private void method2601() {
		@Pc(12) Random local12 = new Random((long) this.anInt3200);
		this.aShortArray39 = new short[512];
		if (this.anInt3209 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray39[local32] = (short) Static222.method3672(local12, this.anInt3209);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.aByteArray35 = Static80.method1473(this.anInt3200);
		this.method2601();
	}
}
