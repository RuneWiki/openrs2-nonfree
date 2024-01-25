import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public interface Interface8 extends Interface4 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method5366(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	void method7032();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
	boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Z")
	boolean method5368();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method5369();
}
