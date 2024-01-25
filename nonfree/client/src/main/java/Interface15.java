import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public interface Interface15 extends Interface8 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method5732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z")
	boolean method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	void method7351();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z")
	boolean method5734();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method5735();
}
