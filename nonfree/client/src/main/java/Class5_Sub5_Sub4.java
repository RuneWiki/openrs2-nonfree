import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class5_Sub5_Sub4 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "Lclient!vu;")
	public final Class368 aClass368_2;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub5_Sub4(@OriginalArg(0) String arg0) {
		this.aString26 = arg0;
		this.aClass368_2 = new Class368();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
	public int method1892() {
		return this.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66 == this.aClass368_2.aClass5_Sub5_64 ? -1 : ((Class5_Sub5_Sub15) this.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66).anInt6765;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!oj;I)Z")
	public boolean method1893(@OriginalArg(0) Class5_Sub5_Sub15 arg0) {
		arg0.method8952();
		@Pc(10) boolean local10 = true;
		@Pc(24) Class5_Sub5_Sub15 local24 = (Class5_Sub5_Sub15) this.aClass368_2.method8702();
		while (local24 != null) {
			if (Static70.method1149(local24.anInt6765, arg0.anInt6765)) {
				Static569.method8252(local24, arg0);
				this.anInt2287++;
				if (local10) {
					return false;
				}
				return true;
			}
			local24 = (Class5_Sub5_Sub15) this.aClass368_2.method8710();
			local10 = false;
		}
		this.aClass368_2.method8709(arg0);
		this.anInt2287++;
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!oj;Z)Z")
	public boolean method1896(@OriginalArg(0) Class5_Sub5_Sub15 arg0) {
		@Pc(15) int local15 = this.method1892();
		arg0.method8952();
		this.anInt2287--;
		if (this.anInt2287 != 0) {
			return local15 != this.method1892();
		}
		this.method9047();
		this.method8952();
		Static140.anInt2437--;
		Static171.aClass87_94.method1792(arg0.aLong173, this);
		return false;
	}
}
