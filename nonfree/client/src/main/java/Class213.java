import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class213 {

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "Lclient!sga;")
	public Class10_Sub4 aClass10_Sub4_2 = null;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "[Lclient!bq;")
	public Class10_Sub2[] aClass10_Sub2Array2 = null;

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "[Lclient!bq;")
	public Class10_Sub2[] aClass10_Sub2Array3 = null;

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "Lclient!sga;")
	public Class10_Sub4 aClass10_Sub4_1 = null;

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "Lclient!sga;")
	public Class10_Sub4 aClass10_Sub4_3 = null;

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class213(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aBoolean413 = arg0.aBoolean88;
		Static222.method3609(arg0);
		if (this.aBoolean413) {
			@Pc(31) byte[] local31 = Static448.method6401(false, Static10.anObject1);
			this.aClass10_Sub4_2 = new Class10_Sub4(arg0, 6410, 128, 128, 16, local31, 6410);
			@Pc(48) byte[] local48 = Static448.method6401(false, Static237.anObject7);
			this.aClass10_Sub4_1 = new Class10_Sub4(arg0, 6410, 128, 128, 16, local48, 6410);
			@Pc(63) Class185 local63 = arg0.aClass185_1;
			if (local63.method4469()) {
				local31 = Static448.method6401(false, Static579.anObject23);
				this.aClass10_Sub4_3 = new Class10_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(93) Class10_Sub4 local93 = new Class10_Sub4(arg0, 6409, 128, 128, 16, local31, 6409);
				if (local63.method4467(2.0F, local93, this.aClass10_Sub4_3)) {
					this.aClass10_Sub4_3.method7258();
				} else {
					this.aClass10_Sub4_3.method7257();
					this.aClass10_Sub4_3 = null;
				}
				local93.method7257();
				return;
			}
		} else {
			this.aClass10_Sub2Array3 = new Class10_Sub2[16];
			for (@Pc(124) int local124 = 0; local124 < 16; local124++) {
				@Pc(137) byte[] local137 = Static570.method7934(Static10.anObject1, local124 * 2 * 128 * 128);
				this.aClass10_Sub2Array3[local124] = new Class10_Sub2(arg0, 3553, 6410, 128, 128, true, local137, 6410, false);
			}
			this.aClass10_Sub2Array2 = new Class10_Sub2[16];
			for (@Pc(163) int local163 = 0; local163 < 16; local163++) {
				@Pc(174) byte[] local174 = Static570.method7934(Static237.anObject7, local163 * 128 * 256);
				this.aClass10_Sub2Array2[local163] = new Class10_Sub2(arg0, 3553, 6410, 128, 128, true, local174, 6410, false);
			}
		}
	}
}
