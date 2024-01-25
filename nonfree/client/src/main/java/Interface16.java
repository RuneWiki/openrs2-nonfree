import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public interface Interface16 extends Interface6 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method7615(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)Z")
	boolean method7614();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7613();

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	void method7609();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII)Z")
	boolean method7616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
