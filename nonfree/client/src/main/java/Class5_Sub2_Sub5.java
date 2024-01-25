import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
	public int anInt2821;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!hf;")
	public final Class150 aClass150_3;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub2_Sub5(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
		this.aClass150_3 = new Class150();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!nba;I)Z")
	public boolean method2535(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		@Pc(12) int local12 = this.method2536();
		arg0.method8569();
		this.anInt2821--;
		if (this.anInt2821 != 0) {
			return this.method2536() != local12;
		}
		this.method8829();
		this.method8569();
		Static150.anInt2471--;
		Static440.aClass265_47.method6566(this, arg0.aLong197);
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
	public int method2536() {
		return this.aClass150_3.aClass5_Sub2_24 == this.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67 ? -1 : ((Class5_Sub2_Sub13) this.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67).anInt6711;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!nba;Z)Z")
	public boolean method2537(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8569();
		for (@Pc(16) Class5_Sub2_Sub13 local16 = (Class5_Sub2_Sub13) this.aClass150_3.method3100(); local16 != null; local16 = (Class5_Sub2_Sub13) this.aClass150_3.method3096()) {
			if (Static579.method7885(local16.anInt6711, arg0.anInt6711)) {
				Static463.method6854(arg0, local16);
				this.anInt2821++;
				if (local7) {
					return false;
				}
				return true;
			}
			local7 = false;
		}
		this.aClass150_3.method3095(arg0);
		this.anInt2821++;
		return local7;
	}
}
