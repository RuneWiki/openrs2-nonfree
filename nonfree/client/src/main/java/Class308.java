import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class308 {

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
	private int anInt8471 = -1;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!tf;")
	private final Class340 aClass340_64 = new Class340();

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class308(@OriginalArg(0) Class6_Sub15 arg0) {
		this.method7387(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!wfa;Z)V")
	public void method7386(@OriginalArg(0) Class391 arg0) {
		if (arg0.aLong339 != this.aLong271 || this.anInt8471 != arg0.anInt10315) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static23.method263(arg0.aLong339) + " updateNum:" + arg0.anInt10315 + " delta.owner:" + Static23.method263(this.aLong271) + " updateNum:" + this.anInt8471);
		}
		for (@Pc(68) Class6_Sub4 local68 = (Class6_Sub4) this.aClass340_64.method8124(); local68 != null; local68 = (Class6_Sub4) this.aClass340_64.method8134()) {
			local68.method8698(arg0);
		}
		arg0.anInt10315++;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!jc;)V")
	private void method7387(@OriginalArg(1) Class6_Sub15 arg0) {
		this.aLong271 = arg0.method3049();
		this.anInt8471 = arg0.method3015();
		for (@Pc(28) int local28 = arg0.method3030(); local28 != 0; local28 = arg0.method3030()) {
			if (Static682.aBoolean770) {
				System.out.println("t:" + local28);
			}
			@Pc(59) Class6_Sub4 local59;
			if (local28 == 3) {
				local59 = new Class6_Sub4_Sub3();
			} else if (local28 == 1) {
				local59 = new Class6_Sub4_Sub11();
			} else if (local28 == 13) {
				local59 = new Class6_Sub4_Sub12();
			} else if (local28 == 4) {
				local59 = new Class6_Sub4_Sub1();
			} else if (local28 == 6) {
				local59 = new Class6_Sub4_Sub2();
			} else if (local28 == 5) {
				local59 = new Class6_Sub4_Sub7();
			} else if (local28 == 2) {
				local59 = new Class6_Sub4_Sub6();
			} else if (local28 == 7) {
				local59 = new Class6_Sub4_Sub13();
			} else if (local28 == 8) {
				local59 = new Class6_Sub4_Sub4();
			} else if (local28 == 9) {
				local59 = new Class6_Sub4_Sub8();
			} else if (local28 == 10) {
				local59 = new Class6_Sub4_Sub10();
			} else if (local28 == 11) {
				local59 = new Class6_Sub4_Sub9();
			} else if (local28 == 12) {
				local59 = new Class6_Sub4_Sub5();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local59.method8699(arg0);
			this.aClass340_64.method8131(local59);
		}
	}
}
