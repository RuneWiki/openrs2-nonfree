import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public interface Interface12 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
	long method3157();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	int method3158();

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I")
	int method3159();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[BII)V")
	void method3160(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
