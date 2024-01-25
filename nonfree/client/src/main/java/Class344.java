import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class344 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
	public int anInt9352 = 0;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public int anInt9354 = 0;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!de;")
	private final Class69 aClass69_62 = new Class69(64);

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!op;")
	private Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_262;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!nd;")
	private final Class238 aClass238_263;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILclient!nd;Lclient!nd;Lclient!op;)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Interface21 arg3) {
		this.anInterface21_1 = arg3;
		this.aClass238_262 = arg1;
		this.aClass238_263 = arg2;
		if (this.aClass238_262 != null) {
			this.anInt9352 = this.aClass238_262.method5592(1);
		}
		if (this.aClass238_263 != null) {
			this.anInt9354 = this.aClass238_263.method5592(1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!fia;[IJ)Ljava/lang/String;")
	public String method7948(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface21_1 != null) {
			@Pc(20) String local20 = this.anInterface21_1.method1205(arg2, arg0, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!qga;")
	public Class2_Sub7_Sub16 method7949(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub7_Sub16 local11 = (Class2_Sub7_Sub16) this.aClass69_62.method1919((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(35) byte[] local35;
		if (arg0 >= 32768) {
			local35 = this.aClass238_263.method5567(arg0 & 0x7FFF, 1);
		} else {
			local35 = this.aClass238_262.method5567(arg0, 1);
		}
		local11 = new Class2_Sub7_Sub16();
		local11.aClass344_2 = this;
		if (local35 != null) {
			local11.method6602(new Class2_Sub17(local35));
		}
		if (arg0 >= 32768) {
			local11.method6605();
		}
		this.aClass69_62.method1917((long) arg0, local11);
		return local11;
	}
}
