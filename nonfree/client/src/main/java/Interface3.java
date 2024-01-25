import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public interface Interface3 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	int method5204();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	int method5205();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B[BII)V")
	void method5206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)J")
	long method5207();
}
