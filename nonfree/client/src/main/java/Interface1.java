import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface Interface1 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BI)V")
	void method5665(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()I")
	int method5663();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	void method5666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
