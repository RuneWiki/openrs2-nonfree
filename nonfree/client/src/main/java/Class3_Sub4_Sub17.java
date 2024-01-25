import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!q", name = "M", descriptor = "[Lclient!qq;")
	private static final Class309[] aClass309Array1 = new Class309[32];

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public int anInt8611;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!pda;")
	public final Class283 aClass283_10;

	static {
		@Pc(151) Class309[] local151 = Static396.method5960();
		for (@Pc(153) int local153 = 0; local153 < local151.length; local153++) {
			aClass309Array1[local151[local153].anInt8976] = local151[local153];
		}
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub4_Sub17(@OriginalArg(0) String arg0) {
		this.aString112 = arg0;
		this.aClass283_10 = new Class283();
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)I")
	public int method7227() {
		return this.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66 == this.aClass283_10.aClass3_Sub4_51 ? -1 : ((Class3_Sub4_Sub5) this.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66).anInt2775;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLclient!ej;)Z")
	public boolean method7230(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		@Pc(15) int local15 = this.method7227();
		arg0.method8848();
		this.anInt8611--;
		if (this.anInt8611 != 0) {
			return local15 != this.method7227();
		}
		this.method9446();
		this.method8848();
		Static332.anInt5826--;
		Static81.aClass338_4.method8044(arg0.aLong104, this);
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ej;I)Z")
	public boolean method7231(@OriginalArg(0) Class3_Sub4_Sub5 arg0) {
		arg0.method8848();
		@Pc(10) boolean local10 = true;
		for (@Pc(16) Class3_Sub4_Sub5 local16 = (Class3_Sub4_Sub5) this.aClass283_10.method7031(); local16 != null; local16 = (Class3_Sub4_Sub5) this.aClass283_10.method7035()) {
			if (Static377.method5449(arg0.anInt2775, local16.anInt2775)) {
				Static706.method9219(local16, arg0);
				this.anInt8611++;
				if (local10) {
					return false;
				}
				return true;
			}
			local10 = false;
		}
		if (4 != 4) {
			Static504.aClass309_10 = null;
		}
		this.aClass283_10.method7036(arg0);
		this.anInt8611++;
		return local10;
	}
}
