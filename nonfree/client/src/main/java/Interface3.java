import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface Interface3 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	void method433(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBI)V")
	void method434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	void method435(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
	int method436(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method437(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[I)V")
	void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
