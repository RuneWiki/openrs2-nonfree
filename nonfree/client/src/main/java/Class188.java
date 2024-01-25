import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class188 implements Interface25 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!it;")
	private Class28 aClass28_10;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!la;")
	private final Class207 aClass207_58;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!jr;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!la;Lclient!jr;)V")
	public Class188(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class185 arg1) {
		this.aClass207_58 = arg0;
		this.aClass185_1 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
		this.aClass28_10 = Static124.method1879(this.aClass207_58, this.aClass185_1.anInt4810);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		@Pc(22) int local22 = Static79.anInt1667 < Static345.anInt5827 ? Static345.anInt5827 : Static79.anInt1667;
		@Pc(33) int local33 = Static408.anInt7118 > Static627.anInt10422 ? Static408.anInt7118 : Static627.anInt10422;
		@Pc(37) int local37 = this.aClass28_10.method4035();
		@Pc(41) int local41 = this.aClass28_10.method4042();
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = local22;
		@Pc(51) int local51 = local22 * local41 / local37;
		@Pc(58) int local58 = (local33 - local51) / 2;
		if (local51 > local33) {
			local45 = local37 * local33 / local41;
			local51 = local33;
			local58 = 0;
			local43 = (local22 - local45) / 2;
		}
		this.aClass28_10.method4046(local43, local58, local45, local51);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return this.aClass207_58.method4678(this.aClass185_1.anInt4810);
	}
}
