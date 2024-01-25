import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public interface Interface11 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
	int method5413();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	void method5414();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BJ)Z")
	boolean method5415(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
	int method5416();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	void method5417();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	void method5418(@OriginalArg(1) boolean arg0);
}
