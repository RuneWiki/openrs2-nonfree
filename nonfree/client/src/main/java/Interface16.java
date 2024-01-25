import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public interface Interface16 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!ha;)V")
	void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Z")
	boolean method8088(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I")
	int method8089();

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(ILclient!ha;)V")
	void method8090(@OriginalArg(1) Class57 arg0);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)I")
	int method8091(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)I")
	int method8092(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)V")
	void method8093();
}
