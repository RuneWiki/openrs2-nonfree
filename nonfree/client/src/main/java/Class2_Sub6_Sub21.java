import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class2_Sub6_Sub21 extends Class2_Sub6 {

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
	public int anInt10705;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "Lclient!mn;")
	public final Class211 aClass211_12;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub6_Sub21(@OriginalArg(0) String arg0) {
		this.aString106 = arg0;
		this.aClass211_12 = new Class211();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!db;I)Z")
	public boolean method8937(@OriginalArg(0) Class2_Sub6_Sub3 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8933();
		@Pc(16) Class2_Sub6_Sub3 local16 = (Class2_Sub6_Sub3) this.aClass211_12.method6008();
		while (local16 != null) {
			if (Static608.method8914(local16.anInt2631, arg0.anInt2631)) {
				Static288.method5232(local16, arg0);
				this.anInt10705++;
				if (local7) {
					return false;
				}
				return true;
			}
			local16 = (Class2_Sub6_Sub3) this.aClass211_12.method6000();
			local7 = false;
		}
		this.aClass211_12.method6002(arg0);
		this.anInt10705++;
		return local7;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!db;)Z")
	public boolean method8938(@OriginalArg(1) Class2_Sub6_Sub3 arg0) {
		@Pc(15) int local15 = this.method8939();
		arg0.method8933();
		this.anInt10705--;
		if (this.anInt10705 != 0) {
			return this.method8939() != local15;
		}
		this.method9253();
		this.method8933();
		Static193.anInt4507--;
		Static566.aClass169_61.method5001(this, arg0.aLong60);
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
	public int method8939() {
		return this.aClass211_12.aClass2_Sub6_48 == this.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66 ? -1 : ((Class2_Sub6_Sub3) this.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66).anInt2631;
	}
}
