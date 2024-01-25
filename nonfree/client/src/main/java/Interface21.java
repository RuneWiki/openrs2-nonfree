import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public interface Interface21 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BJ)Z")
	boolean method3919(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)I")
	int method3920();

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZZ)V")
	void method3921(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(B)V")
	void method3922();

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(B)I")
	int method3923();

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
	void method3924();
}
