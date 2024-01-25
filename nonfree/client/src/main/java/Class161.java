import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class161 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
	public int anInt4838;

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
	public int anInt4839;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
	public int anInt4840;

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
	public int anInt4843;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
	public int anInt4845;

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "Lclient!kca;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
	public int anInt4846;

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
	public int anInt4848;

	@OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
	public int anInt4849;

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
	public int anInt4850;

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
	private final int anInt4844;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	public final int anInt4847;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
	public final int anInt4842;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
	public final int anInt4841;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(IIIIB)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4844 = arg0;
		this.anInt4847 = arg3;
		this.anInt4842 = arg1;
		this.anInt4841 = arg2;
		this.aByte63 = arg4;
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!kca;I)V")
	public Class161(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		this.aClass161_1 = arg0;
		this.anInt4841 = this.aClass161_1.anInt4841 + arg1;
		this.aByte63 = this.aClass161_1.aByte63;
		this.anInt4847 = arg1 + this.aClass161_1.anInt4847;
		this.anInt4842 = arg1 + this.aClass161_1.anInt4842;
		this.anInt4844 = this.aClass161_1.anInt4844;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIII)Lclient!kca;")
	public Class161 method4180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class161(this.anInt4844, arg2, arg1, arg0, this.aByte63);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)Lclient!dp;")
	public Class69 method4183() {
		return Static224.method3891(this.anInt4844);
	}
}
