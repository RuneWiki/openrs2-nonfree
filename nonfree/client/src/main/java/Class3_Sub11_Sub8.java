import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class3_Sub11_Sub8 extends Class3_Sub11 {

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "Lclient!dha;")
	public final Class74 aClass74_4;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub11_Sub8(@OriginalArg(0) String arg0) {
		this.aString31 = arg0;
		this.aClass74_4 = new Class74();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I")
	public int method3474() {
		return this.aClass74_4.aClass3_Sub11_16 == this.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67 ? -1 : ((Class3_Sub11_Sub14) this.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67).anInt6738;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!oba;)Z")
	public boolean method3476(@OriginalArg(1) Class3_Sub11_Sub14 arg0) {
		@Pc(15) int local15 = this.method3474();
		arg0.method9345();
		this.anInt3796--;
		if (this.anInt3796 != 0) {
			return local15 != this.method3474();
		}
		this.method9380();
		this.method9345();
		Static71.anInt1334--;
		Static555.aClass165_63.method4392(this, arg0.aLong212);
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILclient!oba;)Z")
	public boolean method3477(@OriginalArg(1) Class3_Sub11_Sub14 arg0) {
		arg0.method9345();
		@Pc(10) boolean local10 = true;
		for (@Pc(16) Class3_Sub11_Sub14 local16 = (Class3_Sub11_Sub14) this.aClass74_4.method1842(); local16 != null; local16 = (Class3_Sub11_Sub14) this.aClass74_4.method1844()) {
			if (Static267.method4375(arg0.anInt6738, local16.anInt6738)) {
				Static665.method9177(arg0, local16);
				this.anInt3796++;
				if (local10) {
					return false;
				}
				return true;
			}
			local10 = false;
		}
		this.aClass74_4.method1840(arg0);
		this.anInt3796++;
		return local10;
	}
}
