import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class290 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	private int anInt8121 = -1;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!jia;")
	private final Class193 aClass193_51 = new Class193();

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class290(@OriginalArg(0) Class3_Sub17 arg0) {
		this.method6834(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!rh;I)V")
	public void method6833(@OriginalArg(0) Class308 arg0) {
		if (this.aLong234 != arg0.aLong255 || this.anInt8121 != arg0.anInt8608) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static455.method6553(arg0.aLong255) + " updateNum:" + arg0.anInt8608 + " delta.owner:" + Static455.method6553(this.aLong234) + " updateNum:" + this.anInt8121);
		}
		for (@Pc(64) Class3_Sub4 local64 = (Class3_Sub4) this.aClass193_51.method4457(); local64 != null; local64 = (Class3_Sub4) this.aClass193_51.method4459()) {
			local64.method8504(arg0);
		}
		arg0.anInt8608++;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fca;)V")
	private void method6834(@OriginalArg(1) Class3_Sub17 arg0) {
		this.aLong234 = arg0.method4865();
		this.anInt8121 = arg0.method4868();
		for (@Pc(19) int local19 = arg0.method4888(); local19 != 0; local19 = arg0.method4888()) {
			if (Static277.aBoolean407) {
				System.out.println("t:" + local19);
			}
			@Pc(39) Class3_Sub4 local39;
			if (local19 == 3) {
				local39 = new Class3_Sub4_Sub12();
			} else if (local19 == 1) {
				local39 = new Class3_Sub4_Sub5();
			} else if (local19 == 4) {
				local39 = new Class3_Sub4_Sub10();
			} else if (local19 == 6) {
				local39 = new Class3_Sub4_Sub4();
			} else if (local19 == 5) {
				local39 = new Class3_Sub4_Sub6();
			} else if (local19 == 2) {
				local39 = new Class3_Sub4_Sub7();
			} else if (local19 == 7) {
				local39 = new Class3_Sub4_Sub11();
			} else if (local19 == 8) {
				local39 = new Class3_Sub4_Sub1();
			} else if (local19 == 9) {
				local39 = new Class3_Sub4_Sub8();
			} else if (local19 == 10) {
				local39 = new Class3_Sub4_Sub3();
			} else if (local19 == 11) {
				local39 = new Class3_Sub4_Sub9();
			} else if (local19 == 12) {
				local39 = new Class3_Sub4_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local39.method8503(arg0);
			this.aClass193_51.method4462(local39);
		}
	}
}
