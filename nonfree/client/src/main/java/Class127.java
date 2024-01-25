import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class127 {

	@OriginalMember(owner = "client!go", name = "f", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	private int anInt3254 = -1;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!v;")
	private final Class362 aClass362_15 = new Class362();

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class127(@OriginalArg(0) Class6_Sub23 arg0) {
		this.method2710(arg0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(BLclient!gga;)V")
	private void method2710(@OriginalArg(1) Class6_Sub23 arg0) {
		this.aLong107 = arg0.method8381();
		this.anInt3254 = arg0.method8369();
		for (@Pc(23) int local23 = arg0.method8374(); local23 != 0; local23 = arg0.method8374()) {
			if (Static236.aBoolean268) {
				System.out.println("t:" + local23);
			}
			@Pc(43) Class6_Sub15 local43;
			if (local23 == 3) {
				local43 = new Class6_Sub15_Sub4();
			} else if (local23 == 1) {
				local43 = new Class6_Sub15_Sub12();
			} else if (local23 == 4) {
				local43 = new Class6_Sub15_Sub8();
			} else if (local23 == 6) {
				local43 = new Class6_Sub15_Sub1();
			} else if (local23 == 5) {
				local43 = new Class6_Sub15_Sub2();
			} else if (local23 == 2) {
				local43 = new Class6_Sub15_Sub7();
			} else if (local23 == 7) {
				local43 = new Class6_Sub15_Sub3();
			} else if (local23 == 8) {
				local43 = new Class6_Sub15_Sub5();
			} else if (local23 == 9) {
				local43 = new Class6_Sub15_Sub6();
			} else if (local23 == 10) {
				local43 = new Class6_Sub15_Sub9();
			} else if (local23 == 11) {
				local43 = new Class6_Sub15_Sub10();
			} else if (local23 == 12) {
				local43 = new Class6_Sub15_Sub11();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local43.method8714(arg0);
			this.aClass362_15.method8536(local43);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!hia;I)V")
	public void method2711(@OriginalArg(0) Class145 arg0) {
		if (this.aLong107 != arg0.aLong115 || arg0.anInt3693 != this.anInt3254) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static74.method1301(arg0.aLong115) + " updateNum:" + arg0.anInt3693 + " delta.owner:" + Static74.method1301(this.aLong107) + " updateNum:" + this.anInt3254);
		}
		for (@Pc(61) Class6_Sub15 local61 = (Class6_Sub15) this.aClass362_15.method8538(); local61 != null; local61 = (Class6_Sub15) this.aClass362_15.method8530()) {
			local61.method8716(arg0);
		}
		arg0.anInt3693++;
	}
}
