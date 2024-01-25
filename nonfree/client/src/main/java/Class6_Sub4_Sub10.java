import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class6_Sub4_Sub10 extends Class6_Sub4 {

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
	public int anInt5448;

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!laa", name = "x", descriptor = "Lclient!wd;")
	public final Class384 aClass384_11;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub4_Sub10(@OriginalArg(0) String arg0) {
		this.aString71 = arg0;
		this.aClass384_11 = new Class384();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLclient!pja;)Z")
	public boolean method4628(@OriginalArg(1) Class6_Sub4_Sub12 arg0) {
		@Pc(16) int local16 = this.method4630();
		arg0.method9043();
		this.anInt5448--;
		if (this.anInt5448 != 0) {
			return this.method4630() != local16;
		}
		this.method9174();
		this.method9043();
		Static305.anInt5201--;
		Static653.aClass10_63.method366(this, arg0.aLong225);
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!pja;)Z")
	public boolean method4629(@OriginalArg(1) Class6_Sub4_Sub12 arg0) {
		arg0.method9043();
		@Pc(12) boolean local12 = true;
		@Pc(18) Class6_Sub4_Sub12 local18 = (Class6_Sub4_Sub12) this.aClass384_11.method8910();
		while (local18 != null) {
			if (Static300.method4281(arg0.anInt7577, local18.anInt7577)) {
				Static42.method910(local18, arg0);
				this.anInt5448++;
				if (local12) {
					return false;
				}
				return true;
			}
			local18 = (Class6_Sub4_Sub12) this.aClass384_11.method8908();
			local12 = false;
		}
		this.aClass384_11.method8909(arg0);
		this.anInt5448++;
		return local12;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	public int method4630() {
		return this.aClass384_11.aClass6_Sub4_62 == this.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67 ? -1 : ((Class6_Sub4_Sub12) this.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67).anInt7577;
	}
}
