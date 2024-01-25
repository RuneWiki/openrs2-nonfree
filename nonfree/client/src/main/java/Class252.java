import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class252 {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	public int anInt6635;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public int anInt6638;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public int anInt6642;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public int anInt6639 = 128;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public int anInt6643 = 128;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public int anInt6637;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.anInt6637 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V")
	private Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6643 = arg1;
		this.anInt6642 = arg3;
		this.anInt6635 = arg4;
		this.anInt6637 = arg0;
		this.anInt6639 = arg2;
		this.anInt6638 = arg5;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lclient!nj;")
	public Class252 method5794() {
		return new Class252(this.anInt6637, this.anInt6643, this.anInt6639, this.anInt6642, this.anInt6635, this.anInt6638);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!nj;)V")
	public void method5797(@OriginalArg(1) Class252 arg0) {
		this.anInt6642 = arg0.anInt6642;
		this.anInt6637 = arg0.anInt6637;
		this.anInt6635 = arg0.anInt6635;
		this.anInt6638 = arg0.anInt6638;
		this.anInt6639 = arg0.anInt6639;
		this.anInt6643 = arg0.anInt6643;
	}
}
