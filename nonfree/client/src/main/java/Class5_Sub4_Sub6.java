import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class5_Sub4_Sub6 extends Class5_Sub4 {

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString36;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "Lclient!dr;")
	public final Class80 aClass80_3;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub4_Sub6(@OriginalArg(0) String arg0) {
		this.aString36 = arg0;
		this.aClass80_3 = new Class80();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!li;B)Z")
	public boolean method2112(@OriginalArg(0) Class5_Sub4_Sub14 arg0) {
		arg0.method8741();
		@Pc(16) boolean local16 = true;
		for (@Pc(24) Class5_Sub4_Sub14 local24 = (Class5_Sub4_Sub14) this.aClass80_3.method1538(); local24 != null; local24 = (Class5_Sub4_Sub14) this.aClass80_3.method1536()) {
			if (Static509.method7369(arg0.anInt5598, local24.anInt5598)) {
				Static164.method5099(local24, arg0);
				this.anInt2325++;
				if (local16) {
					return false;
				}
				return true;
			}
			local16 = false;
		}
		this.aClass80_3.method1537(arg0);
		this.anInt2325++;
		return local16;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public int method2113() {
		return this.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67 == this.aClass80_3.aClass5_Sub4_14 ? -1 : ((Class5_Sub4_Sub14) this.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67).anInt5598;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!li;I)Z")
	public boolean method2114(@OriginalArg(0) Class5_Sub4_Sub14 arg0) {
		@Pc(13) int local13 = this.method2113();
		arg0.method8741();
		this.anInt2325--;
		if (this.anInt2325 != 0) {
			return local13 != this.method2113();
		}
		this.method8911();
		this.method8741();
		Static198.anInt3547--;
		Static517.aClass293_59.method6925(arg0.aLong164, this);
		return false;
	}
}
