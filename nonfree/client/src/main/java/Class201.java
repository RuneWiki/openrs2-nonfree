import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class201 {

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Lclient!gr;")
	public Class24_Sub2 aClass24_Sub2_1 = null;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "[Lclient!sia;")
	public Class24_Sub4[] aClass24_Sub4Array1 = null;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!gr;")
	public Class24_Sub2 aClass24_Sub2_2 = null;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "[Lclient!sia;")
	public Class24_Sub4[] aClass24_Sub4Array2 = null;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "Lclient!gr;")
	public Class24_Sub2 aClass24_Sub2_3 = null;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "Z")
	public final boolean aBoolean465;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class201(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aBoolean465 = arg0.aBoolean680;
		Static616.method8513(arg0);
		if (this.aBoolean465) {
			@Pc(33) byte[] local33 = Static383.method5945(Static429.anObject14, false);
			this.aClass24_Sub2_3 = new Class24_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static383.method5945(Static180.anObject2, false);
			this.aClass24_Sub2_2 = new Class24_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class385 local65 = arg0.aClass385_1;
			if (local65.method8901()) {
				local33 = Static383.method5945(Static437.anObject15, false);
				this.aClass24_Sub2_1 = new Class24_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class24_Sub2 local95 = new Class24_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method8900(this.aClass24_Sub2_1, 2.0F, local95)) {
					this.aClass24_Sub2_1.method6784();
				} else {
					this.aClass24_Sub2_1.method6786();
					this.aClass24_Sub2_1 = null;
				}
				local95.method6786();
				return;
			}
		} else {
			this.aClass24_Sub4Array2 = new Class24_Sub4[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static44.method754(Static429.anObject14, local127 * 16384 * 2);
				this.aClass24_Sub4Array2[local127] = new Class24_Sub4(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass24_Sub4Array1 = new Class24_Sub4[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(179) byte[] local179 = Static44.method754(Static180.anObject2, 2 * 128 * local165 * 128);
				this.aClass24_Sub4Array1[local165] = new Class24_Sub4(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
