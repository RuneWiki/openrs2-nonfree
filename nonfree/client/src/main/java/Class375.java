import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class375 implements Interface5 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!sca;")
	private final Class316 aClass316_2;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!lr;")
	private final Class225 aClass225_1;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!sca;Lclient!lr;)V")
	public Class375(@OriginalArg(0) Class316 arg0, @OriginalArg(1) Class225 arg1) {
		this.aClass316_2 = arg0;
		this.aClass225_1 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;IILclient!da;I)I")
	private int method8950(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class80 arg2, @OriginalArg(5) int arg3) {
		return arg2.method8782(0, 0, this.aClass225_1.anInt6150 - 10, this.aClass225_1.anInt6148, this.aClass225_1.anInt6153, (Class134[]) null, this.aClass225_1.anInt6155 - 10, arg0, 0, (int[]) null, arg3 + 5, 0, (Class1) null, arg1 + 5, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		@Pc(19) Class78 local19 = this.aClass316_2.method7639(this.aClass225_1.anInt6151);
		if (local19 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass225_1.aClass219_8.method5206(this.aClass225_1.anInt6155, Static264.anInt4559) + this.aClass225_1.anInt6147;
		@Pc(50) int local50 = this.aClass225_1.aClass368_8.method8776(this.aClass225_1.anInt6150, Static47.anInt794) + this.aClass225_1.anInt6149;
		if (this.aClass225_1.aBoolean456) {
			Static457.aClass57_11.method7681(local35, local50, this.aClass225_1.anInt6155, this.aClass225_1.anInt6150, this.aClass225_1.anInt6154, 0);
		}
		local50 += this.method8950(local19.aString29, local50, Static533.aClass80_10, local35) * 12;
		local50 += 8;
		if (this.aClass225_1.aBoolean456) {
			Static457.aClass57_11.method7686(local35, local50, local35 + this.aClass225_1.anInt6155 - 1, local50, this.aClass225_1.anInt6154, 0);
		}
		local50++;
		local50 += this.method8950(local19.aString27, local50, Static533.aClass80_10, local35) * 12;
		local50 += 5;
		@Pc(137) int local137 = local50 + this.method8950(local19.aString28, local50, Static533.aClass80_10, local35) * 12;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		return this.aClass316_2.method7637();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
	}
}
