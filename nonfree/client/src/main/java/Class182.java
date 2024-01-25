import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class182 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!sp;")
	public Class21_Sub1_Sub5 aClass21_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!kj;")
	public Class21_Sub1_Sub4 aClass21_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!vea;")
	public Class21_Sub1_Sub3 aClass21_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Lclient!bda;")
	public Class21_Sub1_Sub2 aClass21_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!vea;")
	public Class21_Sub1_Sub3 aClass21_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!bda;")
	public Class21_Sub1_Sub2 aClass21_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "Lclient!lba;")
	public Class192 aClass192_2;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!ko;")
	public Class182 aClass182_1;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.aByte93 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	public void method4453() {
		while (this.aClass192_2 != null) {
			@Pc(11) Class192 local11 = this.aClass192_2.aClass192_3;
			this.aClass192_2.method4605();
			this.aClass192_2 = local11;
		}
	}
}
