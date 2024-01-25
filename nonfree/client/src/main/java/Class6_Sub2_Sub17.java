import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class6_Sub2_Sub17 extends Class6_Sub2 {

	@OriginalMember(owner = "client!pca", name = "E", descriptor = "Lclient!he;")
	private Class128 aClass128_32;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!rg;)V")
	public void method6696(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method6700(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method6697(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass128_32 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub18 local21 = (Class6_Sub18) this.aClass128_32.method3560((long) arg1);
			return local21 == null ? arg0 : local21.aString33;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BILclient!rg;)V")
	private void method6700(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method8604();
		@Pc(21) int local21;
		if (this.aClass128_32 == null) {
			local21 = Static567.method8129(local14);
			this.aClass128_32 = new Class128(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(44) boolean local44 = arg1.method8604() == 1;
			@Pc(48) int local48 = arg1.method8606();
			@Pc(57) Class6 local57;
			if (local44) {
				local57 = new Class6_Sub18(arg1.method8611());
			} else {
				local57 = new Class6_Sub48(arg1.method8579());
			}
			this.aClass128_32.method3551((long) local48, local57);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)I")
	public int method6702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass128_32 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub48 local16 = (Class6_Sub48) this.aClass128_32.method3560((long) arg0);
			return local16 == null ? arg1 : local16.anInt9611;
		}
	}
}
