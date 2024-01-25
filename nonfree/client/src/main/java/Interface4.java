import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public interface Interface4 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)I")
	int method4149(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(II)V")
	void method4150(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method4151(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	void method4152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[I)V")
	void method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BI)V")
	void method4154(@OriginalArg(1) int arg0);
}
