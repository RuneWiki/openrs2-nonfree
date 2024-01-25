import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface1 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BI)V")
	void method2055(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	void method2056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()I")
	int method5379();
}
