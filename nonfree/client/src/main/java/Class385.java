import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class385 implements Interface2 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!kw;")
	private Class178 aClass178_29;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!fh;")
	private final Class115 aClass115_1;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!ik;")
	private final Class182 aClass182_123;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ik;Lclient!fh;)V")
	public Class385(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class115 arg1) {
		this.aClass115_1 = arg1;
		this.aClass182_123 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		return this.aClass182_123.method3964(this.aClass115_1.anInt3080);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
		this.aClass178_29 = Static686.method9056(this.aClass182_123, this.aClass115_1.anInt3080);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		@Pc(15) int local15 = Static221.anInt3616 >= Static681.anInt10652 ? Static221.anInt3616 : Static681.anInt10652;
		@Pc(23) int local23 = Static76.anInt1720 <= Static700.anInt10927 ? Static700.anInt10927 : Static76.anInt1720;
		@Pc(27) int local27 = this.aClass178_29.method7627();
		@Pc(31) int local31 = this.aClass178_29.method7632();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local15;
		@Pc(41) int local41 = local31 * local15 / local27;
		@Pc(47) int local47 = (local23 - local41) / 2;
		if (local23 < local41) {
			local35 = local23 * local27 / local31;
			local41 = local23;
			local47 = 0;
			local33 = (local15 - local35) / 2;
		}
		this.aClass178_29.method7613(local33, local47, local35, local41);
	}
}
