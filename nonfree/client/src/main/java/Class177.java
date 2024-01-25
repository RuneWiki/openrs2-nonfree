import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class177 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	private int anInt4593;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	private int anInt4595;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	private int anInt4598;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Lclient!ul;")
	public Class4_Sub24 aClass4_Sub24_1;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	private int anInt4599;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	private Class177() {
		if (Static332.anIntArray305 == null) {
			Static453.method6969();
		}
		this.method4031();
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!r;Lclient!un;I)V")
	public Class177(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static332.anIntArray305 == null) {
			Static453.method6969();
		}
		this.anInt4590 = arg1.method4905();
		this.aBoolean328 = (this.anInt4590 & 0x8) != 0;
		this.aBoolean327 = (this.anInt4590 & 0x10) != 0;
		this.anInt4590 &= 0x7;
		@Pc(50) int local50 = arg1.method4936() << arg2;
		@Pc(56) int local56 = arg1.method4936() << arg2;
		@Pc(62) int local62 = arg1.method4936() << arg2;
		@Pc(66) int local66 = arg1.method4905();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray57 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray57.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method4936();
			local89 = local85 >>> 8;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			@Pc(104) int local104 = local85 & 0xFF;
			if (local104 > local72 - local89) {
				local104 = local72 - local89;
			}
			this.aShortArray57[local78] = (short) (local89 << 8 | local104);
		}
		local66 = (local66 << Static145.anInt3093) + Static96.anInt8036;
		@Pc(155) int local155 = Static15.anIntArray11 == null ? Static579.anIntArray543[Static126.method2602(arg1.method4936()) & 0xFFFF] : Static15.anIntArray11[arg1.method4936()];
		local89 = arg1.method4905();
		this.anInt4596 = local89 & 0x1F;
		this.anInt4593 = (local89 & 0xE0) << 3;
		if (this.anInt4596 != 31) {
			this.method4031();
		}
		this.method4029(local56, local50, arg0, local66, local62, local155);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILclient!r;III)V")
	private void method4029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub24_1 = arg2.method4979(arg1, arg4, arg0, arg3, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
	private void method4031() {
		@Pc(10) int local10 = this.anInt4596;
		if (local10 == 2) {
			this.anInt4594 = 1;
			this.anInt4598 = 0;
			this.anInt4595 = 2048;
			this.anInt4599 = 2048;
		} else if (local10 == 3) {
			this.anInt4594 = 1;
			this.anInt4598 = 0;
			this.anInt4599 = 2048;
			this.anInt4595 = 4096;
		} else if (local10 == 4) {
			this.anInt4599 = 2048;
			this.anInt4594 = 4;
			this.anInt4595 = 2048;
			this.anInt4598 = 0;
		} else if (local10 == 5) {
			this.anInt4594 = 4;
			this.anInt4598 = 0;
			this.anInt4599 = 2048;
			this.anInt4595 = 8192;
		} else if (local10 == 12) {
			this.anInt4599 = 2048;
			this.anInt4598 = 0;
			this.anInt4595 = 2048;
			this.anInt4594 = 2;
		} else if (local10 == 13) {
			this.anInt4599 = 2048;
			this.anInt4598 = 0;
			this.anInt4594 = 2;
			this.anInt4595 = 8192;
		} else if (local10 == 10) {
			this.anInt4595 = 2048;
			this.anInt4598 = 1536;
			this.anInt4599 = 512;
			this.anInt4594 = 3;
		} else if (local10 == 11) {
			this.anInt4595 = 4096;
			this.anInt4599 = 512;
			this.anInt4598 = 1536;
			this.anInt4594 = 3;
		} else if (local10 == 6) {
			this.anInt4599 = 768;
			this.anInt4594 = 3;
			this.anInt4598 = 1280;
			this.anInt4595 = 2048;
		} else if (local10 == 7) {
			this.anInt4594 = 3;
			this.anInt4595 = 4096;
			this.anInt4599 = 768;
			this.anInt4598 = 1280;
		} else if (local10 == 8) {
			this.anInt4594 = 3;
			this.anInt4598 = 1024;
			this.anInt4599 = 1024;
			this.anInt4595 = 2048;
		} else if (local10 == 9) {
			this.anInt4598 = 1024;
			this.anInt4595 = 4096;
			this.anInt4594 = 3;
			this.anInt4599 = 1024;
		} else if (local10 == 14) {
			this.anInt4598 = 1280;
			this.anInt4594 = 1;
			this.anInt4595 = 2048;
			this.anInt4599 = 768;
		} else if (local10 == 15) {
			this.anInt4598 = 1536;
			this.anInt4594 = 1;
			this.anInt4595 = 4096;
			this.anInt4599 = 512;
		} else if (local10 == 16) {
			this.anInt4595 = 8192;
			this.anInt4598 = 1792;
			this.anInt4594 = 1;
			this.anInt4599 = 256;
		} else {
			this.anInt4594 = 0;
			this.anInt4595 = 2048;
			this.anInt4599 = 2048;
			this.anInt4598 = 0;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BIZ)V")
	public void method4032(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt4595 * arg0 / 50 + this.anInt4593 & 0x7FF;
			@Pc(26) int local26 = this.anInt4594;
			if (local26 == 1) {
				local9 = (Class4_Sub27.anIntArray296[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static332.anIntArray305[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass4_Sub24_1.method7148((float) (this.anInt4598 + (local9 * this.anInt4599 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIII)V")
	public void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4594 = arg1;
		this.anInt4599 = arg3;
		this.anInt4598 = arg0;
		this.anInt4595 = arg2;
	}
}
