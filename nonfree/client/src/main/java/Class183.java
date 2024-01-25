import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class183 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public int anInt4808;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public int anInt4810;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	public int anInt4816;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public int anInt4812 = 128;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public int anInt4814 = 128;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public int anInt4815;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	public Class183(@OriginalArg(0) int arg0) {
		this.anInt4815 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIII)V")
	private Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4810 = arg4;
		this.anInt4812 = arg2;
		this.anInt4808 = arg5;
		this.anInt4816 = arg3;
		this.anInt4815 = arg0;
		this.anInt4814 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!jk;)V")
	public void method4117(@OriginalArg(1) Class183 arg0) {
		this.anInt4810 = arg0.anInt4810;
		this.anInt4815 = arg0.anInt4815;
		this.anInt4816 = arg0.anInt4816;
		this.anInt4812 = arg0.anInt4812;
		this.anInt4808 = arg0.anInt4808;
		this.anInt4814 = arg0.anInt4814;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Lclient!jk;")
	public Class183 method4118() {
		return new Class183(this.anInt4815, this.anInt4814, this.anInt4812, this.anInt4816, this.anInt4810, this.anInt4808);
	}
}
