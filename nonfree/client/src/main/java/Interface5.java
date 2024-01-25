import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public interface Interface5 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)I")
	int method9009();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BJ)Z")
	boolean method9010(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	void method9011();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V")
	void method9012(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
	void method9013();

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
	int method9014();
}
