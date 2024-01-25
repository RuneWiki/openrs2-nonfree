import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class3_Sub7_Sub13 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "Lclient!vu;")
	public final Class363 aClass363_21;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub7_Sub13(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
		this.aClass363_21 = new Class363();
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!sba;I)Z")
	public boolean method3989(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		arg0.method7907();
		@Pc(12) boolean local12 = true;
		for (@Pc(22) Class3_Sub7_Sub19 local22 = (Class3_Sub7_Sub19) this.aClass363_21.method8414(); local22 != null; local22 = (Class3_Sub7_Sub19) this.aClass363_21.method8415()) {
			if (Static23.method324(local22.anInt8564, arg0.anInt8564)) {
				Static433.method6593(arg0, local22);
				this.anInt4660++;
				if (local12) {
					return false;
				}
				return true;
			}
			local12 = false;
		}
		this.aClass363_21.method8413(arg0);
		this.anInt4660++;
		return local12;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)I")
	public int method3990() {
		return this.aClass363_21.aClass3_Sub7_66 == this.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63 ? -1 : ((Class3_Sub7_Sub19) this.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63).anInt8564;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!sba;B)Z")
	public boolean method3993(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		@Pc(7) int local7 = this.method3990();
		arg0.method7907();
		this.anInt4660--;
		if (this.anInt4660 != 0) {
			return this.method3990() != local7;
		}
		this.method8682();
		this.method7907();
		Static334.anInt6266--;
		Static614.aClass136_70.method3135(this, arg0.aLong228);
		return false;
	}
}
