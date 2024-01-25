import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface Interface15 extends Interface5 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8744();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	void method8737();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Z")
	boolean method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z")
	boolean method8747();
}
