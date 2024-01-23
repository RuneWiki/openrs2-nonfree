import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class13 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public int anInt3322;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	protected int anInt3316;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
	protected Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3322 = arg1;
		this.anInt3316 = arg2;
		this.anInt3315 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public abstract void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)V")
	public abstract void method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
	public abstract void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
