import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public interface Interface9 {

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "([BIII)V")
	void method8391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
	int method8392();

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)J")
	long method8393();

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)I")
	int method8394();
}
