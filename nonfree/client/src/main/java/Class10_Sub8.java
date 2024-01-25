import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	private final int anInt4486;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	private final int anInt4482;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
	private final int anInt4487;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	private final int anInt4489;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	private final int anInt4490;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
	private final int anInt4494;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
	private final int anInt4483;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
	private final int anInt4493;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	private final int anInt4484;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	private final int anInt4491;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
	private final int anInt4496;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
	private final int anInt4492;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
	private final int anInt4485;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!rba;II)V")
	public Class10_Sub8(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(26) int local26;
		if (arg1 == 0) {
			local26 = arg0.method5312();
			this.anInt4487 = -1;
			this.anInt4482 = local26 & 0xFFFF;
			this.anInt4486 = local26 >>> 16;
		} else {
			this.anInt4486 = -1;
			this.anInt4482 = -1;
			this.anInt4487 = arg0.method5272();
		}
		if (arg2 == 0) {
			local26 = arg0.method5312();
			this.anInt4489 = local26 >>> 16;
			this.anInt4490 = local26 & 0xFFFF;
			this.anInt4494 = -1;
		} else {
			this.anInt4490 = -1;
			this.anInt4489 = -1;
			this.anInt4494 = arg0.method5272();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt4483 = arg0.method5322(-83);
		} else {
			this.anInt4483 = -1;
		}
		this.anInt4493 = arg0.method5272();
		this.anInt4484 = arg0.method5322(-93);
		this.anInt4491 = arg0.method5322(-102);
		this.anInt4496 = arg0.method5307();
		this.anInt4492 = arg0.method5272();
		this.anInt4485 = arg0.method5322(-45);
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(42) Class19_Sub1_Sub3_Sub2 local42;
		if (this.anInt4486 >= 0) {
			local23 = this.anInt4486 * 512 + 256;
			local30 = this.anInt4482 * 512 + 256;
			local33 = this.anInt4483;
		} else {
			local42 = Static154.aClass11Array1[this.anInt4487].method295();
			local30 = local42.anInt11211;
			local33 = local42.aByte146;
			local23 = local42.anInt11204;
		}
		@Pc(72) int local72;
		@Pc(69) int local69;
		if (this.anInt4482 < 0) {
			local42 = Static154.aClass11Array1[this.anInt4494].method295();
			if (local33 < 0) {
				local33 = local42.aByte146;
			}
			local69 = local42.anInt11211;
			local72 = local42.anInt11204;
		} else {
			local72 = this.anInt4489 * 512 + 256;
			local69 = this.anInt4490 * 512 + 256;
		}
		@Pc(93) int local93 = this.anInt4485 << 2;
		@Pc(129) Class19_Sub1_Sub3_Sub1 local129 = new Class19_Sub1_Sub3_Sub1(this.anInt4493, local33, local33, local23, local30, this.anInt4484 << 2, Static269.anInt4883, Static269.anInt4883 + this.anInt4496, this.anInt4492, local93, this.anInt4487 + 1, this.anInt4494 + 1, this.anInt4491 << 2, false, 0);
		local129.method2618(this.anInt4491 << 2, local69, local72, Static269.anInt4883 + this.anInt4496);
		Static358.aClass357_33.method8401(new Class3_Sub4_Sub14(local129));
	}
}
