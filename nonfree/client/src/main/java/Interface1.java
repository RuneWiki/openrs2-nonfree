import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public interface Interface1 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	void method41(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method42(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)I")
	int method43(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V")
	void method44(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	void method45(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[I)V")
	void method46(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
