import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public interface Interface2 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
	void method4566();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	void method4567(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
	void method4568();

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
	int method4569();
}
